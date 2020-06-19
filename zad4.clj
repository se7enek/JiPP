(defonce persons-atom (atom {}))

(defn add-person!
  [email imie nazwisko ulica numer kod miasto]
  (swap! persons-atom assoc
         email {:imie imie
                :nazwisko nazwisko
                :ulica ulica
                :numer numer
                :kod_pocztowy kod
                :miasto miasto}))
(defn imie
  [email]
  (:imie (@persons-atom email)))
(defn nazwisko
  [email]
  (:nazwisko (@persons-atom email)))
(defn adres
  [email]
  (str
   (str "Adres uzytkownika (" email ") to: ")
   (:ulica (@persons-atom email)) " "
   (:numer (@persons-atom email)) ", "
   (:kod_pocztowy (@persons-atom email)) " "
   (:miasto (@persons-atom email))
   ))

(add-person!"osoba@mail.com" "John" "Doe" "Piotrkowska" "100" "15-200" "Lodz")
(add-person!"konrad@mail.com" "Konrad" "Dope" "Piotrkowska" "150" "99-100" "Lodz")

(println (adres "osoba@mail.com"))
(println (adres "konrad@mail.com"))