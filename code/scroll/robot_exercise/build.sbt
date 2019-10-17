name := "MOSTSCROLLTask1"

lazy val commonSettings = Seq(
  organization := "tu.dresden.de",
  version := "0.0.1",
  scalaVersion := "2.12.4",
  scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-language:reflectiveCalls", "-encoding", "utf8")
)

lazy val main = (project in file(".")).settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      "com.github.max-leuthaeuser" %% "scroll" % "latest.integration",
      "org.scalatest" %% "scalatest" % "3.0.4" % "test"
    )
  )
