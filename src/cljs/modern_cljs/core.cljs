(ns modern-cljs.core
  (:require
    [rum.core :as rum]))

(enable-console-print!)

(rum/defc app [] [:div.app "Hello!"])

(rum/mount (app) (js/document.getElementById "app"))
