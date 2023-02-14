package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.|

@js.native
trait ThemeOptions extends js.Object {
  def mixins: js.UndefOr[MixinsOptions] = js.native

  def components: js.UndefOr[Nothing] = js.native

  def palette: js.UndefOr[PaletteOptions] = js.native

  def shadows: js.UndefOr[js.Array[String]] = js.native

  def transitions: js.UndefOr[TransitionsOptions] = js.native

  def typography: js.UndefOr[TypographyOptions | Palette => TypographyOptions] = js.native

  def zIndex: js.UndefOr[ZIndexOptions] = js.native

  def unstable_strictMode: js.UndefOr[Boolean] = js.native
}

object ThemeOptions {

  def apply(
             mixins: js.UndefOr[MixinsOptions] = js.undefined,
             palette: js.UndefOr[PaletteOptions] = js.undefined,
             shadows: js.UndefOr[js.Array[String]] = js.undefined,
             transitions: js.UndefOr[TransitionsOptions] = js.undefined,
             typography: js.UndefOr[TypographyOptions | js.Function1[Palette, TypographyOptions]] = js.undefined,
             zIndex: js.UndefOr[ZIndexOptions] = js.undefined,
             unstable_strictMode: js.UndefOr[Boolean] = js.undefined,
           ) = {
    val o: Map[String, Any] = Seq(
      mixins.toOption.map("mixins" -> _),
      palette.toOption.map("palette" -> _),
      shadows.toOption.map("shadows" -> _),
      transitions.toOption.map("transitions" -> _),
      typography.toOption.map("typography" -> _),
      zIndex.toOption.map("zIndex" -> _),
      unstable_strictMode.toOption.map("unstable_strictMode" -> _),
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ThemeOptions]
  }

}
