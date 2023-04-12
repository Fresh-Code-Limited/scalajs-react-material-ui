package io.kinoplan.scalajs.react.material.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps

object MuiAccordion extends ReactBridgeComponent with MuiAccordionExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "Accordion")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    CollapseProps: js.UndefOr[js.Object] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledGutters: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[js.Function] = js.undefined,
    component: js.UndefOr[ComponentPropType] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
  ): WithProps = auto

}

trait MuiAccordionExtensions {

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
