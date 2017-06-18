# Learn Clojure

An implementation following
[this ClojureScript tutorial](https://github.com/magomimmo/modern-cljs).

## Development

Start a live-reloaded webserver with

    make live

Connect to a bREPL by

1. `make live`
1. In another terminal, `boot repl -c`
1. In that REPL, `(start-repl)`
1. Visit `localhost:3000` in your browser
1. Try `(js/alert "Hello, world!")` from the REPL
