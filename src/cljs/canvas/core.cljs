(ns canvas.core
  (:require [clojure.browser.repl :as repl])
  (:use-macros [dommy.macros :only [sel1]]))

(repl/connect "http://localhost:9000/repl")

(.log js/console (sel1 :#canvas))

;; PROBLEM: REPL aktualisiert sich nicht! oO
