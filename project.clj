(defproject task-list "0.1.0-SNAPSHOT"
  :description "For tracking your tasks."
  :url "http://github.com/ags799/learn-clojure"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot task-list.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
