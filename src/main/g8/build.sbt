name := "$pluginName$"

version := "0.1"

scalaVersion := "$scalaVersion$"

sbtPlugin := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"
)

