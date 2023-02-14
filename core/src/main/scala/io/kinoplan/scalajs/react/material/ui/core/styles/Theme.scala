package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Theme extends js.Object {
  def mixins: Mixins = js.native

  def palette: Palette = js.native

  def shadows: js.Array[String] = js.native

  def transitions: Transitions = js.native

  def typography: Typography = js.native

  def zIndex: ZIndex = js.native

}

object Theme {

  def apply(
             mixins: Mixins,
             palette: Palette,
             shadows: js.Array[String],
             transitions: Transitions,
             typography: Typography,
             zIndex: ZIndex,
           ): Theme = {
    val o: Map[String, Any] = Seq(
      Some("mixins" -> mixins),
      Some("palette" -> palette),
      Some("shadows" -> shadows),
      Some("transitions" -> transitions),
      Some("typography" -> typography),
      Some("zIndex" -> ZIndex)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Theme]
  }

}
