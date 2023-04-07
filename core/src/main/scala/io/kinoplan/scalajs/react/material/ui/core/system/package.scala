package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.VdomNode

package object system {

  @JSImport(
    "@mui/system/colorManipulator.js",
    JSImport.Default
  )
  @js.native
  object colorManipulator extends js.Object {
    def hexToRgb(hex: String): String = js.native

    def rgbToHex(color: String): String = js.native

    def hslToRgb(color: String): String = js.native

    def decomposeColor(color: String): ColorObject = js.native

    def colorChannel(color: String): String = js.native

    def private_safeColorChannel(color: String, warning: js.UndefOr[String]): String = js.native

    def recomposeColor(color: ColorObject): String = js.native

    def getContrastRatio(foreground: String, background: String): Double = js.native

    def getLuminance(color: String): Double = js.native

    def emphasize(color: String, coefficient: js.UndefOr[Double]): String = js.native

    def private_safeEmphasize(
      color: String,
      coefficient: js.UndefOr[Double],
      warning: js.UndefOr[String]
    ): String = js.native

    def alpha(color: String, value: Double): String = js.native

    def private_safeAlpha(color: String, value: Double, warning: js.UndefOr[String]): String = js.native

    def darken(color: String, coefficient: js.UndefOr[Double]): String = js.native

    def private_safeDarken(
      color: String,
      coefficient: js.UndefOr[Double],
      warning: js.UndefOr[String]
    ): String = js.native

    def lighten(color: String, coefficient: js.UndefOr[Double]): String = js.native

    def private_safeLighten(
      color: String,
      coefficient: js.UndefOr[Double],
      warning: js.UndefOr[String]
    ): String = js.native

  }

  @JSImport(
    "@mui/system/createTheme/createTheme.js",
    JSImport.Default
  )
  @js.native
  object createTheme extends js.Function1[js.UndefOr[ThemeOptions], Theme] {
    override def apply(options: js.UndefOr[ThemeOptions] = js.undefined): Theme = js.native
  }

  @JSImport(
    "@mui/system/createTheme/createBreakpoints.js",
    JSImport.Default
  )
  @js.native
  object createBreakpoints extends js.Function1[BreakpointsOptions, Breakpoints] {
    override def apply(options: BreakpointsOptions): Breakpoints = js.native
  }

  @JSImport(
    "@mui/system/useThemeProps/getThemeProps.js",
    JSImport.Default
  )
  @js.native
  object getThemeProps extends js.Function1[js.Object, js.Any] {
    override def apply(params: js.Object): js.Any = js.native
  }

  @JSImport("@mui/system/shadows.js", JSImport.Default)
  @js.native
  object shadows extends js.Array[String]

  @JSImport("@mui/material/styles/withTheme.js", JSImport.Default)
  @js.native
  object withTheme extends js.Function0[js.Function1[VdomNode, VdomNode]] {
    override def apply(): js.Function1[VdomNode, VdomNode] = js.native
  }

  @JSImport("@mui/system/zIndex.js", JSImport.Default)
  @js.native
  object zIndex extends ZIndex

}
