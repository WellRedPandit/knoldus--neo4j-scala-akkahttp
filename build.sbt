name := """neo4j-akka-http-starter-kit"""

version := "1.0"

scalaVersion := "2.12.3"

organization := "com.knoldus"

val vAkkaHttp = "10.0.10"

libraryDependencies ++= Seq(
  "org.neo4j.driver" % "neo4j-java-driver" % "1.4.3",
  "org.scalatest"     %% "scalatest" % "3.0.4" % "test",
  "com.typesafe.akka" %% "akka-http-core" % vAkkaHttp,
  "com.typesafe.akka" %% "akka-http" % vAkkaHttp,
  "com.typesafe.akka" %% "akka-http-testkit" % vAkkaHttp,
  "com.typesafe.akka" %% "akka-http-spray-json" % vAkkaHttp,
  "com.typesafe.akka" %% "akka-http-jackson" % vAkkaHttp,
  "com.typesafe.akka" %% "akka-http-xml" % vAkkaHttp
  )
