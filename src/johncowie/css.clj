(ns johncowie.css
  (:require [garden.core :refer [css]]
            [garden.stylesheet :refer [at-media]]))

(defn generate-css []
(css
 ;{:output-to "resources/public/css/foo.css"}

    [:body {:font-family ["'Open Sans'" "sans-serif"]}]
    [:a {:text-decoration :none
         :color :#BB2299
         :font-weight :800}
         [:&:hover {:color :#FF0000}]]
    [:.container
       {:width "600px"
        :margin [["0px" "auto" "0px" "auto"]]}
     ]

    (at-media {:max-width "600px"} [:.container {:width "100%"}])

    [:span.date {:color "#999"}]

    [:p.content {:display :block}])
  )
