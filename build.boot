(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[adzerk/boot-cljs]])

(require '[adzerk.boot-cljs :refer [cljs]])
