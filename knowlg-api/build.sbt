import sbt.Keys._
import play.sbt.PlaySettings

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, PlayNettyServer)
  .disablePlugins(PlayAkkaHttpServer)
  .settings(
    name := "knowlg-api",
    version := "1.0",
    scalaVersion := "2.12.8",
    javacOptions ++= Seq("-source", "11", "-target", "11"),
    libraryDependencies ++= Seq(
      guice,
      "org.joda" % "joda-convert" % "2.1.2",
      "net.logstash.logback" % "logstash-logback-encoder" % "5.2",
      "org.sunbird" % "actor-core" % "1.0-SNAPSHOT",
      "org.sunbird" % "graph-engine_2.12" % "1.0-SNAPSHOT",
      "javax.inject" % "javax.inject" % "1",
      "io.lemonlabs" %% "scala-uri" % "1.4.10",
      "net.codingwell" %% "scala-guice" % "4.2.5",
      "com.typesafe.play" %% "play-specs2" % "2.7.9",
      "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
    )
  )
  resolvers += "Local Maven Repository" at "file:///"+Path.userHome+"/.m2/repository"
