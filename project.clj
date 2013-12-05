(defproject canvas "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :source-paths ["src/clj", "src/cljs"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2080"]

                 [compojure "1.1.6"]
                 [ring "1.2.1"]
                 [enlive "1.1.5"]
                 
                 [prismatic/dommy "0.1.2"]
                 [com.cemerick/piggieback "0.1.2"]]

  :plugins [[lein-cljsbuild "1.0.0"]
            [com.cemerick/austin "0.1.3"]]


  :cljsbuild { 
    :builds [{:id "canvas"
              :source-paths ["src"]
              :compiler {
                :output-to "canvas.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
