lazy val akkaHttpVersion = "10.0.8"
lazy val akkaVersion    = "2.5.3" asdf

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "pulihora",
      scalaVersion    := "2.12.1"
    )),
    name := "pulihora",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"         % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"       % akkaVersion,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "org.scalatest"     %% "scalatest"         % "3.0.1"         % Test
    )
  )
