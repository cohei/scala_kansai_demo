name := "scala-kansai-demo"

version := "0.1"

scalaVersion := "2.12.8"

scalafmtOnCompile in ThisBuild := true

lazy val root = (project in file("."))
  .aggregate(
    api
  )

lazy val api = project
  .settings(
    name := "api",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Dependencies.api,
    scalacOptions ++= Seq("-Ypartial-unification")
  )
