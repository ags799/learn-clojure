(ns modern-cljs.core
  (:require
    [rum.core :as rum]))

(enable-console-print!)

(println "Hello, world!")

(rum/defc app [] [:div.app "Hello!"])

(rum/mount (app) (js/document.getElementById "app"))
