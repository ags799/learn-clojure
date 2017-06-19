(ns modern-cljs.core
  (:require
    [rum.core :as rum]
    [datascript.core :as datascript]))

(enable-console-print!)

(def task-list [{:description "buy milk"} {:description "groom dog"}])

(rum/defc header [] [:h1 "Tasks"])

(rum/defc task [t] [:li (:description t)])

(rum/defc tasks []
  [:ol (map-indexed #(rum/with-key (task %2) %1) task-list)])

(rum/defc app [] [:div.app (header) (tasks)])

(rum/mount (app) (js/document.getElementById "app"))
