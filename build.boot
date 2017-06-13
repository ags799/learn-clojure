(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[adzerk/boot-cljs "2.0.0"]])

(require '[adzerk.boot-cljs :refer [cljs]])
