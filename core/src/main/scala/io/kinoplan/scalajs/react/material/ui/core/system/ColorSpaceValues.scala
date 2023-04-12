package io.kinoplan.scalajs.react.material.ui.core.system

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait ColorSpaceValues extends js.Object {
  def srgb: String = js.native
  def displayP3: String = js.native
  def a98Rgb: String = js.native
  def prophotoRgb: String = js.native
  def rec2020: String = js.native
}

object ColorSpaceValues {

  def apply(
    rgb: String,
    rgba: String,
    hsl: String,
    hsla: String,
    color: String
  ) = {
    val o: Map[String, Any] = Map(
      "srgb" -> rgb,
      "display-p3" -> rgba,
      "a98-rg" -> hsl,
      "prophoto-rgb" -> hsla,
      "rec-2020" -> color
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ColorSpaceValues]
  }

}
