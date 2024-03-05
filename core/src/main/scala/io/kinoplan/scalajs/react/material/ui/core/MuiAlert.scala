package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiAlert extends ReactBridgeComponent with MuiAlertExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Alert")
  @js.native
  object RawComponent extends js.Function

  def apply(action: js.UndefOr[VdomNode] = js.undefined,
            classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
            closeText: js.UndefOr[String] = js.undefined,
            color: js.UndefOr[Color.Value] = js.undefined,
            severity: js.UndefOr[Color.Value] = js.undefined,
            icon: js.UndefOr[VdomNode] = js.undefined,
            role: js.UndefOr[String] = js.undefined,
            onClose: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
            variant: js.UndefOr[Variant.Value] = js.undefined,
            sx: js.UndefOr[SxProps] = js.undefined,
            component: js.UndefOr[ComponentPropType] = js.undefined,
           ): WithProps = auto

}

trait MuiAlertExtensions {
  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val filled = "filled"
    val outlined = "outlined"
  }

  object Color extends Enumeration {
    type Value = String

    val success = "success"
    val info = "info"
    val warning = "warning"
    val error = "error"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val filled = "filled"
    val outlined = "outlined"
    val standard = "standard"
    val standardSuccess = "standardSuccess"
    val standardInfo = "standardInfo"
    val standardWarning = "standardWarning"
    val standardError = "standardError"
    val outlinedSuccess = "outlinedSuccess"
    val outlinedInfo = "outlinedInfo"
    val outlinedWarning = "outlinedWarning"
    val outlinedError = "outlinedError"
    val filledSuccess = "filledSuccess"
    val filledInfo = "filledInfo"
    val filledWarning = "filledWarning"
    val filledError = "filledError"
    val icon = "icon"
    val message = "message"
    val action = "action"
  }

}
