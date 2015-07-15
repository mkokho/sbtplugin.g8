package $pluginPackage$

import sbt._
import sbt.Keys._

/**
* A simple plugin implemetaion.
*
* For best plugin practices check 
*  http://www.scala-sbt.org/0.13/docs/Plugins-Best-Practices.html 
*/
object $pluginName$ extends AutoPlugin {

  /**
   * Defines all settings/tasks that get automatically imported,
   * when the plugin is enabled.
   * In case you want separate settings definitions, move it to 
   * an external object. 
   */
  object autoImport {
    lazy val sampleTask = TaskKey[Unit]("sample-task", "Does something useful")
    lazy val sampleSetting = SettingKey[String]("sample-setting", "A very important setting")
  }
 
  import autoImport._
 
  /**
   * Provide default settings for the project
   */
  override lazy val projectSettings = Seq(
    sampleSetting := "sample value",
    sampleTask := {streams.value.log.info( "Value: " + sampleSetting.value)}   
  )
}