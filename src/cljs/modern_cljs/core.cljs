(ns modern-cljs.core
  (:require
    [rum.core :as rum]
    [datascript.core :as datascript]))

(enable-console-print!)

(def task-list [{:description "buy milk"} {:description "groom dog"}])

(rum/defc header [] [:h1 "Tasks"])

(rum/defc form []
  [:form {:on-submit #(false)}
    [:input {:type "text"}]
    [:input {:type "submit"}]])

(rum/defc task [t] [:li (:description t)])

(rum/defc tasks []
  [:ol (map-indexed #(rum/with-key (task %2) %1) task-list)])

(rum/defc app [db] [:div.app (header) (form) (tasks)])

(def schema {})
(defonce conn (datascript/create-conn schema))
(defn render [db] (rum/mount (app db) (js/document.getElementById "app")))
(datascript/listen! conn :render
  (fn [tx-report] (render (:db-after tx-report))))

(render @conn)
