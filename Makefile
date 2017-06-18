.PHONY: live

live:
	boot serve -d target watch reload cljs-repl cljs target
