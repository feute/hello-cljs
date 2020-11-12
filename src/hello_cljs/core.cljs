(ns ^:figwheel-hooks hello-cljs.core
  (:require [reagent.dom :as rdom]))

(defn app []
  [:h1 "Hello, CLJS!"])

(defn mount []
  (rdom/render [app] (js/document.getElementById "app")))

(defn ^:after-load re-render []
  (mount))

(defonce start-up (do (mount) true))
