(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[org.clojure/clojure "1.8.0"]  ; must match boot.properties
                  [org.clojure/clojurescript "1.9.562"]
                  [adzerk/boot-cljs "2.0.0"]
                  [pandeiro/boot-http "0.8.3"]
                  [adzerk/boot-reload "0.5.1"]
                  [adzerk/boot-cljs-repl "0.3.3"]
                  [com.cemerick/piggieback "0.2.2"]
                  [weasel "0.7.0"]
                  [rum "0.10.8"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(def target-directory "target")

(deftask dev
  "Start development environment."
  []
  (comp
    (serve :dir target-directory)
    (watch)
    (reload)
    (cljs-repl)
    (cljs)
    (target :dir #{target-directory})))
