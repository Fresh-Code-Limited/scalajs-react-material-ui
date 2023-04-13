package io.kinoplan.scalajs.react.material.ui.core.system

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeActionPartial extends js.Object {
  def active: js.UndefOr[String] = js.native
  def hover: js.UndefOr[String] = js.native
  def hoverOpacity: js.UndefOr[Double] = js.native
  def selected: js.UndefOr[String] = js.native
  def selectedOpacity: js.UndefOr[Double] = js.native
  def disabled: js.UndefOr[String] = js.native
  def disabledOpacity: js.UndefOr[Double] = js.native
  def disabledBackground: js.UndefOr[String] = js.native
  def focus: js.UndefOr[String] = js.native
  def focusOpacity: js.UndefOr[Double] = js.native
  def activatedOpacity: js.UndefOr[Double] = js.native
}

object TypeActionPartial {

  def apply(
    active: js.UndefOr[String] = js.undefined,
    hover: js.UndefOr[String] = js.undefined,
    hoverOpacity: js.UndefOr[Double] = js.undefined,
    selected: js.UndefOr[String] = js.undefined,
    selectedOpacity: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[String] = js.undefined,
    disabledOpacity: js.UndefOr[Double] = js.undefined,
    disabledBackground: js.UndefOr[String] = js.undefined,
    focus: js.UndefOr[String] = js.undefined,
    focusOpacity: js.UndefOr[Double] = js.undefined,
    activatedOpacity: js.UndefOr[Double] = js.undefined,
  ) = {
    val o: Map[String, Any] = Seq(
      active.toOption.map("active" -> _),
      hover.toOption.map("hover" -> _),
      hoverOpacity.toOption.map("hoverOpacity" -> _),
      selected.toOption.map("selected" -> _),
      selectedOpacity.toOption.map("selected" -> _),
      disabled.toOption.map("disabled" -> _),
      disabledOpacity.toOption.map("disabled" -> _),
      disabledBackground.toOption.map("disabledBackground" -> _),
      focus.toOption.map("focus" -> _),
      focusOpacity.toOption.map("focus" -> _),
      activatedOpacity.toOption.map("focus" -> _),
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeActionPartial]
  }

}
