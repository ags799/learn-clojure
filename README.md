# Learn Clojure

An implementation following
[this ClojureScript tutorial](https://github.com/magomimmo/modern-cljs).

## Development

Prepare your development enviroment by installing [Boot](http://boot-clj.com/).

Start a live-reloaded webserver with

    boot dev

Connect to a bREPL by

1. `boot dev`
1. In another terminal, `boot repl -c`
1. In that REPL, `(start-repl)`
1. Visit `localhost:3000` in your browser
1. Try `(js/alert "Hello, world!")` from the REPL
