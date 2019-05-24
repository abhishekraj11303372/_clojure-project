(ns clojure-project.core
  ( :use compojure.core)
  ( :require [compojure.route :as route]))

(defn foo [x] (str x "Hello," x))

(defroutes my-routes
           (GET "/" [] (foo "Jim"))
           (route/resources "/"))
