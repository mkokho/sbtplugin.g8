/**
* This project tests the plugin in the directory ../
* Just run sbt and test the setting that are provided 
* by the plugin
*/

scalaVersion := "$scalaVersion$"

val root = (project in file("."))
  .enablePlugins($pluginName$)
