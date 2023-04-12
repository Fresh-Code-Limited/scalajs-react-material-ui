package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps

object MuiCardMedia extends ReactBridgeComponent with MuiCardMediaExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "CardMedia")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    image: js.UndefOr[String] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiCardMediaExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val media = "media"
  }

}
