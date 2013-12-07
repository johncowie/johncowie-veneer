(ns johncowie.provider
  (:require [clojure.java.io :refer [file]]
            [clj-http.client :as client]
            [cheshire.core :refer [parse-string]]
            ))

(def root "http://www.johncowie.co.uk")

(def all-posts-url (str root "?json=1"))

(defn post-url [id]
  (str all-posts-url "&p=" id))

(defn- get-data [url]
  (parse-string (:body (client/get url)) #(keyword %)))

(defn posts []
  (get-data all-posts-url))

(defn post [id]
  (get-data (post-url id)))

