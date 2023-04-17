package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTextField extends ReactBridgeComponent with MuiTextFieldExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "TextField")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    defaultValue: js.UndefOr[js.Any] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    FormHelperTextProps: js.UndefOr[js.Object] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: js.UndefOr[VdomNode] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    InputLabelProps: js.UndefOr[js.Object] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: js.UndefOr[ComponentRefType] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    //onBlur
    //onFocus
    placeholder: js.UndefOr[String] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    maxRows: js.UndefOr[String | Int] = js.undefined,
    minRows: js.UndefOr[String | Int] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined,
    SelectProps: js.UndefOr[js.Object] = js.undefined,
    size: js.UndefOr[String] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,

    //onChange: js.UndefOr[] = js.undefined,
    InputProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
  ): WithProps = auto

}

trait MuiTextFieldExtensions {

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
    val error = "error"
    val info = "info"
    val success = "success"
    val warning = "warning"
  }

  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }

}
