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
                  [weasel "0.7.0"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])
