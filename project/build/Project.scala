import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val scalaToolsSnapshots = "scalaToolsSnapshots" at "http://scala-tools.org/repo-snapshots/"
    val specs = "org.scala-tools.testing" %% "specs" % "1.6.7-SNAPSHOT"
}