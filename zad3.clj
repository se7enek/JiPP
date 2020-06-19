(defn abs [x] (if (> x 0)(x)(- x)))

(defn nwd
  [a b]
  (last
   (filter
    #(and (zero? (mod b %)) (zero? (mod a %)))
    (range 1 (inc (min a b))))))

(defn nww
  [a b]
  (/ (abs (* a b)) (nwd a b)))

(reduce nww (map #(* 1 %) (range 1 (inc 20))))