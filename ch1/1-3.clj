(defn square
  [x]
  (* x x))

(defn sum-of-squares
  [[x y]]
  (+ (square x) (square y)))

(defn largest-numbers
  [x y z]
  (cond
   (and (<= x y) (<= x z)) [y z]
   (and (<= y x) (<= y z)) [x z]
   true [x y]))

(defn one-three
  [x y z]
  (sum-of-squares (largest-numbers x y z)))