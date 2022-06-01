ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

organization := "io.vigg"
publishMavenStyle := true
githubOwner := "Muelleau"
githubRepository := "skrtb"
githubTokenSource := TokenSource.GitConfig("github.token")

resolvers += Resolver.githubPackages("OWNER")

lazy val skrtb = (project in file("."))
  .settings(
    name := "skrtb",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.13.2" % Test,
      "org.scalatest" %% "scalatest" % "3.2.11" % Test
    )
  )
