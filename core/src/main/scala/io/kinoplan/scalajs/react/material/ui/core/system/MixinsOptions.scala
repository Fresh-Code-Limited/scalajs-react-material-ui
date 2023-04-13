package io.kinoplan.scalajs.react.material.ui.core.system

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MixinsOptions extends js.Object {
  def toolbar: js.UndefOr[CSSProperties] = js.native
}

object MixinsOptions {

  def apply(
    toolbar: js.UndefOr[CSSProperties] = js.undefined
  ) = {
    val o: Map[String, Any] = Seq(
      toolbar.toOption.map("toolbar" -> _)
    ).flatten.toMap

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MixinsOptions]
  }

}
