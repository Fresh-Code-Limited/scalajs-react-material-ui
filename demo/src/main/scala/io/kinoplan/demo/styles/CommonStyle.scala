package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.components.Layout
import io.kinoplan.scalajs.react.material.ui.core.colors
import io.kinoplan.scalajs.react.material.ui.core.system.{
  PaletteOptions,
  Theme,
  ThemeOptions,
  TypographyOptions,
  createTheme
}

class CommonStyle extends StyleSheet.Inline {
  import dsl._

  val spacingUnit = 1
  def theme: Theme = Layout.defaultTheme.getOrElse(
    createTheme(
      options = ThemeOptions(
        typography = TypographyOptions(useNextVariants = true),
        palette = PaletteOptions(primary = colors.blue),
        spacing = spacingUnit,
      )
    )
  )

  val gutters = style(
    paddingLeft((spacingUnit * 2).px),
    paddingRight((spacingUnit * 2).px),
//    media.minWidth(theme.breakpoints.values.sm.px)(
//      paddingLeft((spacingUnit * 3).px),
//      paddingRight((spacingUnit * 3).px)
//    )
  )

  val emptyStyle = style()

  val flexGrowOne = style(
    flexGrow(1)
  )

  val menuButton = style(
    marginRight((spacingUnit * 2).px)
  )

  val menuButtonDesktop = style(
    marginLeft(-18.px),
    marginRight(10.px)
  )

  val title = style(
    flexGrow(1)
  )

  val componentTitleFont = style(
    color.rgba(0, 0, 0, 0.87),
    fontSize(16.px),
    fontFamily :=! "\"Roboto\", \"Helvetica\", \"Arial\", sans-serif;"
  )

  val componentTitlePadding = style(
    padding(0.px, 8.px),
    marginTop(16.px),
    marginBottom(16.px)
  )

  val demo = style(
    borderRadius(theme.shape.borderRadius.px),
    display.flex,
    justifyContent.center,
    paddingTop((spacingUnit * 2).px),
    paddingBottom((spacingUnit * 2).px),
    paddingLeft((spacingUnit * 2).px),
    paddingRight((spacingUnit * 2).px),
//    media.minWidth(theme.breakpoints.values.sm.px)(
//      paddingLeft((spacingUnit * 3).px),
//      paddingRight((spacingUnit * 3).px),
//      paddingTop((spacingUnit * 6).px),
//      paddingBottom((spacingUnit * 3).px)
//    )
  )

  val demoPaper = styleF.bool(isLight =>
    if (isLight) styleS(backgroundColor :=! theme.palette.grey.`200`)
    else styleS(backgroundColor :=! theme.palette.grey.`900`)
  )

  val paper = styleF.bool(isLight =>
    if (isLight) styleS(backgroundColor :=! colors.common.white)
    else styleS(backgroundColor :=! theme.palette.grey.`800`)
  )

  val demoHiddenHeader = style(
    paddingTop((spacingUnit * 2).px),
//    media.minWidth(theme.breakpoints.values.sm.px)(
//      paddingTop((spacingUnit * 3).px)
//    )
  )

  val avatar = style(
    margin(10.px)
  )

}

object DefaultCommonStyle extends CommonStyle
