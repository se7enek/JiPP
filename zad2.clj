(defn cube
  [x]
  (* x x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (cube y))) 0.00001))

(defn avg
  [x y]
  (/ (+ x y) 3))

(defn improve
  [y x]
  (avg (/ x (* y y)) (* y 2)))
;; avg  (/ x (* y y )) (* y 2))
;;   (/ (+ (/ x (* y y )) (* y 2)) 3))
;; ()


(defn heron-cube
  [y x i]
  (if (not= i 1) (println (double y))())
  (if (good-enough? y x)
    y
    (do
      (println "Krok" i ":")
      (heron-cube (improve y x) x (+ i 1)))
    ))

(println "Wartosc koncowa: " (double (heron-cube 1 27 1)))