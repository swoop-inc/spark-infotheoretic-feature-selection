name := "spark-infotheoretic-feature-selection"

version := "0.1-spark-3.0"

organization := "com.github.sramirez"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-mllib" % "3.0.1" % Provided
)

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.10.5",
  "org.scalatest" %% "scalatest" % "3.0.8",
  "junit" % "junit" % "4.12"
).map(_ % Test)

resolvers += "Maven Repo" at "https://repo1.maven.org/maven2/"

publishMavenStyle := true
