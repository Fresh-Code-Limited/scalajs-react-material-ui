package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js.|

object MuiAutocomplete extends ReactBridgeComponent with MuiAutocompleteExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Autocomplete")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    clearIcon: js.UndefOr[VdomNode] = js.undefined,
    clearText: js.UndefOr[String] = js.undefined,
    closeText: js.UndefOr[String] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    forcePopupIcon: js.UndefOr[Boolean | String] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    getLimitTagsText: js.UndefOr[js.Function] = js.undefined,
    ListboxComponent: js.UndefOr[ComponentPropType] = js.undefined,
    ListboxProps: js.UndefOr[ComponentPropType] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loadingText: js.UndefOr[js.Function] = js.undefined,
    limitTags: js.UndefOr[Int] = js.undefined,
    noOptionsText: js.UndefOr[js.Function] = js.undefined,
    openText: js.UndefOr[String] = js.undefined,
    PaperComponent: js.UndefOr[ComponentPropType] = js.undefined,
    PopperComponent: js.UndefOr[ComponentPropType] = js.undefined,
    popupIcon: js.UndefOr[js.Function] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
//    renderGroup: js.UndefOr[js.Function] = js.undefined,
//    renderInput: js.UndefOr[js.Function] = js.undefined,
//    renderOption: js.UndefOr[js.Function] = js.undefined,
//    renderTags: js.UndefOr[js.Function] = js.undefined,
    size: js.UndefOr[String] = js.undefined,
    slotProps: js.UndefOr[js.Object] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
  ): WithProps = auto

}

trait MuiAutocompleteExtensions {

  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String

    override val root = "root"
    override val rounded = "rounded"
    val expanded = "expanded"
    val disabled = "disabled"
    val gutters = "gutters"
    val region = "region"
  }

}
