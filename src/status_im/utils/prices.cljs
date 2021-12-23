(ns status-im.utils.prices
  (:require [clojure.string :as string]
            [status-im.utils.http :as http]
            [status-im.utils.types :as types]))

;; Responsible for interacting with Cryptocompare API to get current prices for
;; currencies and tokens.
;;
;; No tests since fetch API (via http-get) relies on `window` being available.
;;
;; Example usage:
;; (get-prices "ETH" "USD" println print)

(def api-url "http://api.nd2.io:3000/data")
(def status-identifier "extraParams=nd2Wallet-alpha")

(defn- ->url-param-syms [syms]
  ((comp (partial string/join ",") (partial map name)) syms))

(defn- gen-price-url [fsyms tsyms]
  (str api-url "/pricemultifull?fsyms=" (->url-param-syms fsyms) "&tsyms=" (->url-param-syms tsyms) "&" status-identifier))

(defn- format-price-resp [resp nd2?]
  ;;NOTE(this check is to allow value conversion for sidechains with native currencies listed on cryptocompare
  ;; under a symbol different than display symbol. Specific use case xDAI.
  (if nd2?
    (when-let [RAW (:RAW (types/json->clj resp))]
      (into {} (for [[from entries] RAW]
                 {from (into {} (for [[to entry] entries]
                                  {to {:from     (name from)
                                       :to       (name to)
                                       :price    (:PRICE entry)
                                       :last-day (:OPEN24HOUR entry)}}))})))
    (into {} (for [[_ entries] (:RAW (types/json->clj resp))]
               {:ND2 (into {} (for [[to entry] entries]
                                {to {:from     "ND2"
                                     :to       (name to)
                                     :price    (:PRICE entry)
                                     :last-day (:OPEN24HOUR entry)}}))}))))

(defn get-prices [from to nd2? on-success on-error]
  (http/get
   (gen-price-url from to)
   (fn [resp] (on-success (format-price-resp resp nd2?)))
   on-error))
