package io.kinoplan.scalajs.react.material.ui.core

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import io.kinoplan.scalajs.react.material.ui.core.system.SxProps
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiAccordionSummary extends ReactBridgeComponent with MuiAccordionSummaryExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@mui/material", "AccordionSummary")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    expandIcon: js.UndefOr[VdomNode] = js.undefined,
    sx: js.UndefOr[SxProps] = js.undefined,
  ): WithProps = auto

}

trait MuiAccordionSummaryExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val expanded = "expanded"
    val focusVisible = "focusVisible"
    val disabled = "disabled"
    val gutters = "gutters"
    val contentGutters = "contentGutters"
    val content = "content"
    val expandIconWrapper = "expandIconWrapper"
  }

}
