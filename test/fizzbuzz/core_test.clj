(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
    (testing "returns true for 3"
        (is (= true (divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
    (testing "returns false for 1"
        (is (= false (divisible-by-three? 1)))))

(deftest is-divisible-by-five
    (testing "returns true for 5"
        (is (= true (divisible-by-five? 5)))))

(deftest is-not-divisible-by-five
    (testing "returns false for 1"
        (is (= false (divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
    (testing "returns true for 15"
        (is (= true (divisible-by-fifteen? 15)))))

(deftest is-not-divisible-by-fifteen
    (testing "returns false for 1"
        (is (= false (divisible-by-fifteen? 1)))))

(deftest returns-fizz-for-three
    (testing "returns 'Fizz' for 3"
        (is (= "Fizz" (play-game 3)))))

(deftest returns-buzz-for-five
    (testing "returns 'Buzz' for 5"
        (is (= "Buzz" (play-game 5)))))

(deftest returns-fizbuzz-for-15
    (testing "returns 'FizzBuzz' for 15"
        (is (= "FizzBuzz" (play-game 15)))))

(deftest returns-1-for-1
    (testing "returns 1 for 1"
        (is (= 1 (play-game 1)))))


