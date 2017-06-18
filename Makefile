.PHONY: live

live:
	boot serve -d target watch reload cljs target
