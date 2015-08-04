(ns app.core
     (:gen-class)
(:use
   [twitter.callbacks]
   [twitter.api.search]))

   (defn -main
     "Application entry point"
     [& args]
	 (println search :params {:q "sports"})
     (comment Do app initialization here)
    )
