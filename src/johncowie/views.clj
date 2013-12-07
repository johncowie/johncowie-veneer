(ns johncowie.views
  (:require [hiccup.core :refer [html]]
            [hiccup.page :refer [include-css include-js]]))

(defn- header []
  [:head
     [:title "johncowie.co.uk"]
     (include-css "/css")
     (include-js
      "/js/d3.v3.min.js"
      "/js/jquery-2.0.3.min.js"
      "/js/underscore-min.js")
     [:link {:href "http://fonts.googleapis.com/css?family=Open+Sans"
                :rel "stylesheet" :type "text/css"}]
   ])

(def topbar
   [:div.topbar
      [:h1 "johncowie.co.uk"]
    ]
  )

(defn- page-container [& content]
  (html
     (header)
     [:body
        [:div {:class :container}
         topbar
         content
         ]
         (include-js "/js/main.js")]))

(defn multiple-post-view [{posts :posts}]
   (page-container
        (for [post posts]
            [:div
             [:h2 (:title post)]
             [:span {:class :date} (:date post)]
             [:p.content (:content post)]])))

(defn post-view [{post :post}]
  (page-container
        [:h2 (:title post)]
        [:p (:content post)]))

(defn editor-view []
  (page-container
        [:div.tiny])
  )



