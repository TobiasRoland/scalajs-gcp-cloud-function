package codes.mostly.gcp.cloudfunctions

import io.scalajs.npm.express.{Request, Response}

import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.{Function2 => JSFunction2}

object HelloWorldExample {
  @JSExportTopLevel("helloWorld")
  val helloWorld: JSFunction2[Request, Response, Unit] = (req, res) ⇒ {
    res.status(200).send("Hello World")
  }
}
