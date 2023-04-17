package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps

object MuiButtonGroup extends ReactBridgeComponent with MuiButtonGroupExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "ButtonGroup")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disableElevation: js.UndefOr[Boolean] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    orientation: js.UndefOr[Orientation.Value] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
  ): WithProps = auto

}

trait MuiButtonGroupExtensions {

  object Color extends Enumeration {
    type Value = String

    val inherit = "inherit"
    val primary = "primary"
    val secondary = "secondary"
    val error = "error"
    val info = "info"
    val success = "success"
    val warning = "warning"
  }

  object Orientation extends Enumeration {
    type Value = String

    val vertical = "vertical"
    val horizontal = "horizontal"
  }

  object Size extends Enumeration {
    type Value = String

    val small = "small"
    val medium = "medium"
    val large = "large"
  }

  object Variant extends Enumeration {
    type Value = String

    val text = "text"
    val outlined = "outlined"
    val contained = "contained"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val contained = "contained"
    val outlined = "outlined"
    val text = "text"
    val disableElevation = "disableElevation"
    val disabled = "disabled"
    val fullWidth = "fullWidth"
    val vertical = "vertical"
    val grouped = "grouped"
    val groupedHorizontal = "groupedHorizontal"
    val groupedVertical = "groupedVertical"
    val groupedText = "groupedText"
    val groupedTextHorizontal = "groupedTextHorizontal"
    val groupedTextVertical = "groupedTextVertical"
    val groupedTextPrimary = "groupedTextPrimary"
    val groupedTextSecondary = "groupedTextSecondary"
    val groupedOutlined = "groupedOutlined"
    val groupedOutlinedHorizontal = "groupedOutlinedHorizontal"
    val groupedOutlinedVertical = "groupedOutlinedVertical"
    val groupedOutlinedPrimary = "groupedOutlinedPrimary"
    val groupedOutlinedSecondary = "groupedOutlinedSecondary"
    val groupedContained = "groupedContained"
    val groupedContainedHorizontal = "groupedContainedHorizontal"
    val groupedContainedVertical = "groupedContainedVertical"
    val groupedContainedPrimary = "groupedContainedPrimary"
    val groupedContainedSecondary = "groupedContainedSecondary"
  }

}
