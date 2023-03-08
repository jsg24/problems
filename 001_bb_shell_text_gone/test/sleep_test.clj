(ns sleep-test
  (:require [clojure.test :refer [deftest]]))

(deftest my-test
  (println "Press \"Ctrl C\" now!")
  (Thread/sleep 13000)
  )