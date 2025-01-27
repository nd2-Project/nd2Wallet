(ns status-im.utils.currency
  (:require [status-im.i18n.i18n :as i18n]))

(def currencies
  {
  ;; :aed {:id :aed :code "AED" :display-name (i18n/label :t/currency-display-name-aed) :symbol "د.إ"}
   ;; :afn {:id :afn :code "AFN" :display-name (i18n/label :t/currency-display-name-afn) :symbol "؋"}
   :ars {:id :ars :code "ARS" :display-name (i18n/label :t/currency-display-name-ars) :symbol "$"}
   ;; :aud {:id :aud :code "AUD" :display-name (i18n/label :t/currency-display-name-aud) :symbol "$"}
   ;; :bbd {:id :bbd :code "BBD" :display-name (i18n/label :t/currency-display-name-bbd) :symbol "$"}
   ;; :bdt {:id :bdt :code "BDT" :display-name (i18n/label :t/currency-display-name-bdt) :symbol " Tk"}
   ;; :bgn {:id :bgn :code "BGN" :display-name (i18n/label :t/currency-display-name-bgn) :symbol "лв"}
   ;; :bhd {:id :bhd :code "BHD" :display-name (i18n/label :t/currency-display-name-bhd) :symbol "BD"}
   ;; :bnd {:id :bnd :code "BND" :display-name (i18n/label :t/currency-display-name-bnd) :symbol "$"}
   ;; :bob {:id :bob :code "BOB" :display-name (i18n/label :t/currency-display-name-bob) :symbol "$b"}
   :brl {:id :brl :code "BRL" :display-name (i18n/label :t/currency-display-name-brl) :symbol "R$"}
   ;; :btn {:id :btn :code "BTN" :display-name (i18n/label :t/currency-display-name-btn) :symbol "Nu."}
   :cad {:id :cad :code "CAD" :display-name (i18n/label :t/currency-display-name-cad) :symbol "$"}
   ;; :chf {:id :chf :code "CHF" :display-name (i18n/label :t/currency-display-name-chf) :symbol "CHF"}
  ;;  :clp {:id :clp :code "CLP" :display-name (i18n/label :t/currency-display-name-clp) :symbol "$"}
   ;; :cny {:id :cny :code "CNY" :display-name (i18n/label :t/currency-display-name-cny) :symbol "¥"}
   :cop {:id :cop :code "COP" :display-name (i18n/label :t/currency-display-name-cop) :symbol "$"}
   ;; :crc {:id :crc :code "CRC" :display-name (i18n/label :t/currency-display-name-crc) :symbol "₡"}
   ;; :czk {:id :czk :code "CZK" :display-name (i18n/label :t/currency-display-name-czk) :symbol "Kč"}
   ;; :dkk {:id :dkk :code "DKK" :display-name (i18n/label :t/currency-display-name-dkk) :symbol "kr"}
   ;; :dop {:id :dop :code "DOP" :display-name (i18n/label :t/currency-display-name-dop) :symbol "RD$"}
  ;;  :egp {:id :egp :code "EGP" :display-name (i18n/label :t/currency-display-name-egp) :symbol "£"}
  ;;  :etb {:id :etb :code "ETB" :display-name (i18n/label :t/currency-display-name-etb) :symbol "Br"}
  ;;  :eur {:id :eur :code "EUR" :display-name (i18n/label :t/currency-display-name-eur) :symbol "€"}
  ;;  :gbp {:id :gbp :code "GBP" :display-name (i18n/label :t/currency-display-name-gbp) :symbol "£"}
  ;;  :gel {:id :gel :code "GEL" :display-name (i18n/label :t/currency-display-name-gel) :symbol "₾"}
  ;;  :ghs {:id :ghs :code "GHS" :display-name (i18n/label :t/currency-display-name-ghs) :symbol "¢"}
  ;;  :hkd {:id :hkd :code "HKD" :display-name (i18n/label :t/currency-display-name-hkd) :symbol "$"}
  ;;  :hrk {:id :hrk :code "HRK" :display-name (i18n/label :t/currency-display-name-hrk) :symbol "kn"}
  ;;  :huf {:id :huf :code "HUF" :display-name (i18n/label :t/currency-display-name-huf) :symbol "Ft"}
  ;;  :idr {:id :idr :code "IDR" :display-name (i18n/label :t/currency-display-name-idr) :symbol "Rp"}
  ;;  :ils {:id :ils :code "ILS" :display-name (i18n/label :t/currency-display-name-ils) :symbol "₪"}
  ;;  :inr {:id :inr :code "INR" :display-name (i18n/label :t/currency-display-name-inr) :symbol "₹"}
  ;;  :isk {:id :isk :code "ISK" :display-name (i18n/label :t/currency-display-name-isk) :symbol "kr"}
  ;;  :jmd {:id :jmd :code "JMD" :display-name (i18n/label :t/currency-display-name-jmd) :symbol "J$"}
  ;;  :jpy {:id :jpy :code "JPY" :display-name (i18n/label :t/currency-display-name-jpy) :symbol "¥"}
  ;;  :kes {:id :kes :code "KES" :display-name (i18n/label :t/currency-display-name-kes) :symbol "KSh"}
  ;;  :krw {:id :krw :code "KRW" :display-name (i18n/label :t/currency-display-name-krw) :symbol "₩"}
  ;;  :kwd {:id :kwd :code "KWD" :display-name (i18n/label :t/currency-display-name-kwd) :symbol "د.ك"}
  ;;  :kzt {:id :kzt :code "KZT" :display-name (i18n/label :t/currency-display-name-kzt) :symbol "лв"}
  ;;  :lkr {:id :lkr :code "LKR" :display-name (i18n/label :t/currency-display-name-lkr) :symbol "₨"}
  ;;  :mad {:id :mad :code "MAD" :display-name (i18n/label :t/currency-display-name-mad) :symbol "MAD"}
  ;;  :mdl {:id :mdl :code "MDL" :display-name (i18n/label :t/currency-display-name-mdl) :symbol "MDL"}
  ;;  :mur {:id :mur :code "MUR" :display-name (i18n/label :t/currency-display-name-mur) :symbol "₨"}
  ;;  :mwk {:id :mwk :code "MWK" :display-name (i18n/label :t/currency-display-name-mwk) :symbol "MK"}
  :mxn {:id :mxn :code "MXN" :display-name (i18n/label :t/currency-display-name-mxn) :symbol "$"}
  ;;  :myr {:id :myr :code "MYR" :display-name (i18n/label :t/currency-display-name-myr) :symbol "RM"}
  ;;  :mzn {:id :mzn :code "MZN" :display-name (i18n/label :t/currency-display-name-mzn) :symbol "MT"}
  ;;  :nad {:id :nad :code "NAD" :display-name (i18n/label :t/currency-display-name-nad) :symbol "$"}
  ;;  :ngn {:id :ngn :code "NGN" :display-name (i18n/label :t/currency-display-name-ngn) :symbol "₦"}
  ;;  :nok {:id :nok :code "NOK" :display-name (i18n/label :t/currency-display-name-nok) :symbol "kr"}
  ;;  :npr {:id :npr :code "NPR" :display-name (i18n/label :t/currency-display-name-npr) :symbol "₨"}
  ;;  :nzd {:id :nzd :code "NZD" :display-name (i18n/label :t/currency-display-name-nzd) :symbol "$"}
  ;;  :omr {:id :omr :code "OMR" :display-name (i18n/label :t/currency-display-name-omr) :symbol "﷼"}
  :pen {:id :pen :code "PEN" :display-name (i18n/label :t/currency-display-name-pen) :symbol "S/."}
  ;;  :pgk {:id :pgk :code "PGK" :display-name (i18n/label :t/currency-display-name-pgk) :symbol "K"}
  ;;  :php {:id :php :code "PHP" :display-name (i18n/label :t/currency-display-name-php) :symbol "₱"}
  ;;  :pkr {:id :pkr :code "PKR" :display-name (i18n/label :t/currency-display-name-pkr) :symbol "₨"}
  ;;  :pln {:id :pln :code "PLN" :display-name (i18n/label :t/currency-display-name-pln) :symbol "zł"}
  ;;  :pyg {:id :pyg :code "PYG" :display-name (i18n/label :t/currency-display-name-pyg) :symbol "Gs"}
  ;;  :qar {:id :qar :code "QAR" :display-name (i18n/label :t/currency-display-name-qar) :symbol "﷼"}
  ;;  :ron {:id :ron :code "RON" :display-name (i18n/label :t/currency-display-name-ron) :symbol "lei"}
  ;;  :rsd {:id :rsd :code "RSD" :display-name (i18n/label :t/currency-display-name-rsd) :symbol "Дин."}
  ;;  :rub {:id :rub :code "RUB" :display-name (i18n/label :t/currency-display-name-rub) :symbol "₽"}
  ;;  :sar {:id :sar :code "SAR" :display-name (i18n/label :t/currency-display-name-sar) :symbol "﷼"}
  ;;  :sek {:id :sek :code "SEK" :display-name (i18n/label :t/currency-display-name-sek) :symbol "kr"}
  ;;  :sgd {:id :sgd :code "SGD" :display-name (i18n/label :t/currency-display-name-sgd) :symbol "$"}
  ;;  :thb {:id :thb :code "THB" :display-name (i18n/label :t/currency-display-name-thb) :symbol "฿"}
  ;;  :ttd {:id :ttd :code "TTD" :display-name (i18n/label :t/currency-display-name-ttd) :symbol "TT$"}
  ;;  :twd {:id :twd :code "TWD" :display-name (i18n/label :t/currency-display-name-twd) :symbol "NT$"}
  ;;  :tzs {:id :tzs :code "TZS" :display-name (i18n/label :t/currency-display-name-tzs) :symbol "TSh"}
  ;;  :try {:id :try :code "TRY" :display-name (i18n/label :t/currency-display-name-try) :symbol "₺"}
  ;;  :uah {:id :uah :code "UAH" :display-name (i18n/label :t/currency-display-name-uah) :symbol "₴"}
  ;;  :ugx {:id :ugx :code "UGX" :display-name (i18n/label :t/currency-display-name-ugx) :symbol "USh"}
  ;;  :uyu {:id :uyu :code "UYU" :display-name (i18n/label :t/currency-display-name-uyu) :symbol "$U"}
  :usd {:id :usd :code "USD" :display-name (i18n/label :t/currency-display-name-usd) :symbol "$"}
  ;;  :vef {:id :vef :code "VEF" :display-name (i18n/label :t/currency-display-name-vef) :symbol "Bs"}
  ;;  :vnd {:id :vnd :code "VND" :display-name (i18n/label :t/currency-display-name-vnd) :symbol "₫"}
  ;;  :zar {:id :zar :code "ZAR" :display-name (i18n/label :t/currency-display-name-zar) :symbol "R"}
   })