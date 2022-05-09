name := "spark-infotheoretic-feature-selection"

version := "0.1.0"

organization := "com.swoop"

scalaVersion := "2.12.12"

homepage := Some(url("https://github.com/swoop-inc/spark-infotheoretic-feature-selection"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-mllib" % "3.0.1" % Provided
)

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.10.5",
  "org.scalatest" %% "scalatest" % "3.0.8",
  "junit" % "junit" % "4.12"
).map(_ % Test)

publishMavenStyle := true
publishTo := sonatypePublishToBundle.value
scmInfo := Some(ScmInfo(url("https://github.com/swoop-inc/spark-infotheoretic-feature-selection"), "git@github.com:swoop-inc/spark-infotheoretic-feature-selection.git"))
developers ++= List(
  Developer("greglu", "Greg Lu", "@greglu", url("https://github.com/greglu"))
)
