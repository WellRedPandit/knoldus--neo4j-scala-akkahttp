name := """neo4j-akka-http-starter-kit"""

version := "1.0"

scalaVersion := "2.12.3"

organization := "com.knoldus"

val vakkaHttp = "10.0.9"

libraryDependencies ++= Seq(
  "org.neo4j.driver" % "neo4j-java-driver" % "1.4.2",
  "org.scalatest"     %% "scalatest" % "3.0.3" % "test",
  "com.typesafe.akka" %% "akka-http-core" % vakkaHttp,
  "com.typesafe.akka" %% "akka-http" % vakkaHttp,
  "com.typesafe.akka" %% "akka-http-testkit" % vakkaHttp,
  "com.typesafe.akka" %% "akka-http-spray-json" % vakkaHttp,
  "com.typesafe.akka" %% "akka-http-jackson" % vakkaHttp,
  "com.typesafe.akka" %% "akka-http-xml" % vakkaHttp
  )