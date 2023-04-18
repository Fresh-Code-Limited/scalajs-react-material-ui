package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.facade.React
import japgolly.scalajs.react.vdom.html_<^._
import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps

object MuiChip extends ReactBridgeComponent with MuiChipExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Chip")
  @js.native
  object RawComponent extends js.Function

  def apply(
    avatar: js.UndefOr[React.Element] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    deleteIcon: js.UndefOr[React.Element] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[React.Element] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    onDelete: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
    size: js.UndefOr[Size.Value] = js.undefined,
    skipFocusWhenDisabled: js.UndefOr[Boolean] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
    tabIndex: js.UndefOr[Int] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
  ): WithPropsNoChildren = autoNoChildren

}

trait MuiChipExtensions {

  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val primary = "primary"
    val secondary = "secondary"
    val error = "error"
    val info = "info"
    val success = "success"
    val warning = "warning"
  }

  object Size extends Enumeration {
    type Value = String

    val small = "small"
    val medium = "medium"
  }

  object Variant extends Enumeration {
    type Value = String

    val filled = "filled"
    val outlined = "outlined"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val sizeSmall = "sizeSmall"
    val sizeMedium = "sizeMedium"
    val colorError = "colorError"
    val colorInfo = "colorInfo"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorSuccess = "colorSuccess"
    val colorWarning = "colorWarning"
    val disabled = "disabled"
    val clickable = "clickable"
    val clickableColorPrimary = "clickableColorPrimary"
    val clickableColorSecondary = "clickableColorSecondary"
    val deletable = "deletable"
    val deletableColorPrimary = "deletableColorPrimary"
    val deletableColorSecondary = "deletableColorSecondary"
    val outlined = "outlined"
    val filled = "filled"
    val outlinedPrimary = "outlinedPrimary"
    val outlinedSecondary = "outlinedSecondary"
    val filledPrimary = "filledPrimary"
    val filledSecondary = "filledSecondary"
    val avatar = "avatar"
    val avatarSmall = "avatarSmall"
    val avatarMedium = "avatarMedium"
    val avatarColorPrimary = "avatarColorPrimary"
    val avatarColorSecondary = "avatarColorSecondary"
    val icon = "icon"
    val iconSmall = "iconSmall"
    val iconMedium = "iconMedium"
    val iconColorPrimary = "iconColorPrimary"
    val iconColorSecondary = "iconColorSecondary"
    val label = "label"
    val labelSmall = "labelSmall"
    val labelMedium = "labelMedium"
    val deleteIcon = "deleteIcon"
    val deleteIconSmall = "deleteIconSmall"
    val deleteIconMedium = "deleteIconMedium"
    val deleteIconColorPrimary = "deleteIconColorPrimary"
    val deleteIconColorSecondary = "deleteIconColorSecondary"
    val deleteIconOutlinedColorPrimary = "deleteIconOutlinedColorPrimary"
    val deleteIconOutlinedColorSecondary = "deleteIconOutlinedColorSecondary"
    val deleteIconFilledColorPrimary = "deleteIconFilledColorPrimary"
    val deleteIconFilledColorSecondary = "deleteIconFilledColorSecondary"
    val focusVisible = "focusVisible"
  }

}
