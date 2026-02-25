val scala3Version = "3.5.2"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "gsoc-onboarding",
    scalaJSUseMainModuleInitializer := true,
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    libraryDependencies ++= List(
      "org.scala-js" %%% "scalajs-dom" % "2.8.0",
      "com.armanbilge" %%% "calico" % "0.2.3"
    )
  )
