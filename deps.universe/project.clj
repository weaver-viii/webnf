(defproject webnf.deps/universe "0.1.15"
  :plugins [[lein-modules "0.3.11"]]
  :description "The uber dependency to get a full set of popular
  dependencies. For development or when you have room in your .m2 repo."
  :dependencies [[webnf.deps/logback "_"]
                 [webnf.deps/dev "_"]
                 [webnf.deps/web "_"]
                 [webnf.deps/contrib "_"]

                 ;; Algorithms
                 [com.lambdaworks/scrypt "1.4.0"]
                 [net.mikera/core.matrix "0.36.1"]
                 [instaparse "1.4.0"]
                 [nf.fr.eraasoft/objectpool "1.1.2"]
                 [clojurewerkz/meltdown "1.1.0"]
                 [net.polyc0l0r/hasch "0.3.0-beta2"]

                 ;; Data formats
                 [clj-time "0.9.0" :exclusions [joda-time]]
                 [net.mikera/vectorz-clj "0.30.1"]
                 [org.reflections/reflections "0.9.10"]
                 [danlentz/clj-uuid "0.1.5"]
                 [org.fressian/fressian "0.6.5"]
                 [cheshire "5.5.0"]

                 ;; Evaluation controllers
                 [com.stuartsierra/component "0.2.3"]
                 [de.kotka/lazymap "3.1.1"]

                 ;; APIs
                 [joda-time "2.8"]
                 [clj-http "1.1.2"]
                 [amazonica "0.3.24" :exclusions [joda-time]]])
