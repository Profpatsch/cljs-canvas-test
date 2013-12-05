    lein do cljsbuild once, repl
    … wait …

    M-x cider RET RET

    (run)

Cljs REPL:

    (def repl-env (reset! cemerick.austin.repls/browser-repl-env
                          (cemerick.austin/repl-env)))
    (cemerick.austin.repls/cljs-repl repl-env)

    (js/alert "Hello World.")


https://github.com/cemerick/austin/tree/0bd94d34e179f0699252dcaad15aac7560da5708/browser-connected-repl-sample
