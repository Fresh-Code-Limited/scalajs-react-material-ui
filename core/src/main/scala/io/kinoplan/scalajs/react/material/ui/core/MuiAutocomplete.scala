package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichMap
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiAutocomplete extends ReactBridgeComponent with MuiAutocompleteExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Autocomplete")
  @js.native
  object RawComponent extends js.Function

  def apply(
             autoComplete: js.UndefOr[Boolean] = js.undefined,
             autoHighlight: js.UndefOr[Boolean] = js.undefined,
             autoSelect: js.UndefOr[Boolean] = js.undefined,
             blurOnSelect: js.UndefOr[BlurOnSelect.Value | Boolean] = js.undefined,
             classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
             clearIcon: js.UndefOr[VdomNode] = js.undefined,
             clearOnBlue: js.UndefOr[Boolean] = js.undefined,
             clearOnEscape: js.UndefOr[Boolean] = js.undefined,
             clearText: js.UndefOr[String] = js.undefined,
             closeText: js.UndefOr[String] = js.undefined,
             componentName: js.UndefOr[String] = js.undefined,
             //             defaultValue: js.UndefOr[String] = js.undefined,
             disableClearable: js.UndefOr[Boolean] = js.undefined,
             disableCloseOnSelect: js.UndefOr[Boolean] = js.undefined,
             disabled: js.UndefOr[Boolean] = js.undefined,
             disabledItemsFocusable: js.UndefOr[Boolean] = js.undefined,
             disableListWrap: js.UndefOr[Boolean] = js.undefined,
             disablePortal: js.UndefOr[Boolean] = js.undefined,
             //             filterOptions: js.UndefOr[Boolean] = js.undefined,
             filterSelectedOptions: js.UndefOr[Boolean] = js.undefined,
             forcePopupIcon: js.UndefOr[Boolean | String] = js.undefined,
             freeSolo: js.UndefOr[Boolean] = js.undefined,
             fullWidth: js.UndefOr[Boolean] = js.undefined,
             getLimitTagsText: js.UndefOr[js.Function] = js.undefined,
             handleHomeEndKeys: js.UndefOr[Boolean] = js.undefined,
             id: js.UndefOr[String] = js.undefined,
             includeInputInList: js.UndefOr[Boolean] = js.undefined,
             inputValue: js.UndefOr[String] = js.undefined,
             isOptionEqualToValue: js.UndefOr[(Any, Any) => Boolean] = js.undefined,
             ListboxComponent: js.UndefOr[ComponentPropType] = js.undefined,
             ListboxProps: js.UndefOr[ComponentPropType] = js.undefined,
             loading: js.UndefOr[Boolean] = js.undefined,
             loadingText: js.UndefOr[js.Function] = js.undefined,
             limitTags: js.UndefOr[Int] = js.undefined,
             multiple: js.UndefOr[Boolean] = js.undefined,
             noOptionsText: js.UndefOr[js.Function] = js.undefined,
             onChange: js.UndefOr[ReactHandler2[ReactEvent, js.Any]] = js.undefined,
             onClose: js.UndefOr[js.Function2[ReactEvent, String, Unit]] = js.undefined,
             onHighlightChange: js.UndefOr[ReactHandler2[ReactEvent, js.Any]] = js.undefined,
             onInputChange: js.UndefOr[ReactHandler2[ReactEvent, js.Any]] = js.undefined,
             onOpen: js.UndefOr[ReactHandler1[ReactEvent]] = js.undefined,
             open: js.UndefOr[Boolean] = js.undefined,
             openOnFocus: js.UndefOr[Boolean] = js.undefined,
             options: js.UndefOr[js.Array[MuiAutocompleteOption]] = js.undefined,
             openText: js.UndefOr[String] = js.undefined,
             PaperComponent: js.UndefOr[ComponentPropType] = js.undefined,
             PopperComponent: js.UndefOr[ComponentPropType] = js.undefined,
             popupIcon: js.UndefOr[js.Function] = js.undefined,
             readOnly: js.UndefOr[Boolean] = js.undefined,
             //    renderGroup: js.UndefOr[js.Function] = js.undefined,
             //    renderInput: js.UndefOr[js.Function] = js.undefined,
             //    renderOption: js.UndefOr[js.Function] = js.undefined,
             //    renderTags: js.UndefOr[js.Function] = js.undefined,
             selectOnFocus: js.UndefOr[Boolean] = js.undefined,
             size: js.UndefOr[String] = js.undefined,
             slotProps: js.UndefOr[js.Object] = js.undefined,
             sx: js.UndefOr[SxProps] = js.undefined,
           ): WithProps = auto

}

trait MuiAutocompleteOption extends js.Object {
  def label: String

  def id: Int
}

object MuiAutocompleteOption {

  def apply(label: String, id: Int) = {
    val o: Map[String, Any] = Map(
      "label" -> label,
      "id" -> id,
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiAutocompleteOption]
  }

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

  object BlurOnSelect extends Enumeration {
    type Value = String
    val touch = "touch"
    val mouse = "mouse"
  }

}
