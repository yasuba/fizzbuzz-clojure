(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisible-by-three? [number] (zero? (mod number 3)))

(defn divisible-by-five? [number] (zero? (mod number 5)))

(defn divisible-by-fifteen? [number] (zero? (mod number 15)))

(defn play-game [number] 
    (if (divisible-by-fifteen? number) "FizzBuzz"
    (if (divisible-by-five? number) "Buzz"
    (if (divisible-by-three? number) "Fizz"
        number))))