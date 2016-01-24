name := """swk-demo-2016"""


description := "Play 2.4 demo project"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  javaCore, javaJdbc, jdbc, 
  "org.mongodb" % "mongo-java-driver" % "3.2.1",
  "javax.mail" % "javax.mail-api" % "1.5.5"
)

fork in run := true