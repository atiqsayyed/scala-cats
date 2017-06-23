name := "scala-cats"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= {
  val circeVersion = "0.8.0"
  Seq(
    "com.typesafe.akka" %% "akka-http" % "10.0.5",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.5",
    "org.typelevel" %% "cats" % "0.9.0",
    "org.scalacheck" %% "scalacheck" % "1.13.4",
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1"
  )
}
