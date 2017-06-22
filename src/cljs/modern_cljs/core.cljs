(ns modern-cljs.core
  (:require
    [rum.core :as rum]
    [reforms.rum :as reforms]
    [datascript.core :as datascript]))

(enable-console-print!)

(def state (atom {:description "placeholder description"}))

(rum/defc form [data]
  (reforms/form
    (reforms/text data [:description])
    (reforms/form-buttons
      (reforms/button-primary "Submit" #(js/alert (:description @data))))))

(rum/defc app [state] [:div (form state)])

(defn render [] (rum/mount (app state) (js/document.getElementById "app")))

(render)
