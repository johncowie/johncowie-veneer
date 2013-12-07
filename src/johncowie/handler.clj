(ns johncowie.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [johncowie.views :as views]
            [johncowie.provider :refer [post posts]]
            [johncowie.css :refer [generate-css]]
            ))

(defn main-page []
    (views/multiple-post-view (posts)))

(defn post-page [id]
    (views/post-view (post id))
  )

(defroutes app-routes
  (GET "/" [] (main-page))
  (GET "/css" [] (generate-css))
  (GET "/editor" [] (views/editor-view))
  (GET "/posts/:id" [id] (post-page id))
  (route/resources "/")
  (route/not-found "Not Found"))


(def app
  (handler/site app-routes))
