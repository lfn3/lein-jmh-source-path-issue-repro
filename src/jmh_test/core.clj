(ns jmh-test.core)

(defn gen-fn []
  (rand-int 10))

(defprotocol AProto
  (get-s [this]))

(defrecord ARecord [s]
  AProto
  (get-s [_] s))

(defn make-a-record [s]
  (->ARecord s))
