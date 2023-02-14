object DependenciesNPM {

  object Versions {
    val reactV               = "18.2.0"
    val reactDomV            = "18.2.0"
    val reactSwipeableViewsV = "0.14.0"
  }

  import Versions._

  // A -> Z
  val materialUiCore                = "@mui/material"                      -> "5.11.8"
  val materialUiIcons               = "@mui/icons-material"                -> "5.11.0"
  val materialUiLab                 = "@mui/lab"                           -> "5.0.0-alpha.119"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactDomV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> "18.0.10"
  val typesReactDom                 = "@types/react-dom"                   -> "18.0.10"
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.1"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.3"
  val emotionReact                  = "@emotion/react"                     -> "11.10.5"
  val emotionStyled                 = "@emotion/styled"                    -> "11.10.5"

}
