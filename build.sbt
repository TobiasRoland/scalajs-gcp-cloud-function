name := "scalajs-gcp-cloud-function"
version := "0.1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
scalaJSModuleKind := org.scalajs.core.tools.linker.backend.ModuleKind.CommonJSModule
scalaJSUseMainModuleInitializer := false

// NOTE! To use dependencies with scala.js, dependencies are declared with triple percentage instead of double
libraryDependencies += "io.scalajs.npm" %%% "express" % "0.4.2"

