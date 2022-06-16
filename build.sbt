ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "apprehensive-daemon",
    idePackagePrefix := Some("org.rr.ad")
  )
