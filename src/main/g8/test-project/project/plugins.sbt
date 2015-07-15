// build root project
lazy val root = Project("test-plugins", file(".")) dependsOn(myplugin)

lazy val myplugin = file("..").getAbsoluteFile.toURI