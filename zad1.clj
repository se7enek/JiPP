(defn square
  [x]
  (* x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

;; (defn good-enough?
;;   [y x]
;;   (< (abs (- x (square y))) 0.00001))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))

(defn heron-sqrt
  [y x i n] ;;y = odpowiedz / x = pierwiastkowana / i = krok / n = max
  ;;(if (good-enough? y x)
  (println "Krok: " i "/" n ":")
  (if (< i n)
    (do
      (println "Aktualna wartosc: " (double y))
      (heron-sqrt (improve y x) x (+ i 1) n))
    y))


;;(heron-sqrt 1 <wartosc pierwiastkowana> 1 <ilosc krokow>)
(println "Aktualna wartosc: " (double (heron-sqrt 1 2 1 8)))