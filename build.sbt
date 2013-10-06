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
  "org.webjars" % "webjars-play_2.10" % "2.2.0"
)

play.Project.playScalaSettings

requireJs += "main.js"

requireJsShim += "main.js"