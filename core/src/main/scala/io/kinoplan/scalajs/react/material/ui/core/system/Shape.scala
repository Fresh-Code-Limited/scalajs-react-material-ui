package io.kinoplan.scalajs.react.material.ui.core.system

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

//deprecated?
@js.native
trait Shape extends js.Object {
  def borderRadius: Double = js.native
}

object Shape {

  def apply(borderRadius: Double) = {
    val o = Map[String, Any](
      "borderRadius" -> borderRadius
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Shape]
  }

}
