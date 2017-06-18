(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[adzerk/boot-cljs "2.0.0"]
                  [pandeiro/boot-http "0.8.3"]
                  [adzerk/boot-reload "0.5.1"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]])
