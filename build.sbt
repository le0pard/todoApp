name := "todoApp"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "org.webjars" % "underscorejs" % "1.5.1",
  "org.webjars" % "jquery" % "2.0.3",
  "org.webjars" % "requirejs" % "2.1.8",
  "org.webjars" % "handlebars" % "1.0.0",
  "org.webjars" % "emberjs" % "1.0.0",
  "org.webjars" % "emberjs-data" % "0.13",
  "org.webjars" % "webjars-play_2.10" % "2.2.0"
)

play.Project.playScalaSettings

// This tells Play to optimize this file and its dependencies
requireJs += "main.js"

requireJsShim += "shim.js"