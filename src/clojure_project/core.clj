(ns clojure-project.core
  ( :use compojure.core
         ring.util.response
         ring.middleware.json)
  ( :require [compojure.route :as route]
             [clojure-project.view :as view] ))

(defn foo [x] (str x "Hello," x))

(defroutes my-routes
           (GET "/" [] (view/index-page))
           (GET "/rest" [] (response {:email "abhishek.raj@marlabs.com"}))
           (route/resources "/"))

(def app (wrap-json-response my-routes))
