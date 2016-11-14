
val scalaVer = "2.11.8"
val akkaVersion = "2.4.11"
val logbackVersion = "1.1.3"
val scalaParserVersion = "1.0.4"
val scalaTestVersion = "2.2.4"
val circeVer = "0.5.1"
lazy val monixVersion         = "2.0.0"
lazy val quillVersion         = "0.10.0"
lazy val phantomV = "1.22.0"

lazy val compileOptions = Seq(
  "-unchecked",
  "-deprecation",
  "-language:_"
)

// If you use groupID %% artifactID % revision instead of groupID % artifactID % revision (the difference is the double %% after the groupID),
// sbt will add your project’s Scala version to the artifact name. This is just a shortcut.
lazy val commonDependencies = Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-core" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,

  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "org.scala-lang.modules" %% "scala-parser-combinators" % scalaParserVersion,

  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion,

  "io.circe" %% "circe-core" % circeVer,
  "io.circe" %% "circe-generic" % circeVer,
  "io.circe" %% "circe-parser" % circeVer,
  "de.heikoseeberger" %% "akka-http-circe" % "1.6.0",
  "org.apache.kafka" % "kafka_2.10" % "0.10.0.1",
  "org.apache.kafka" % "kafka-clients" % "0.10.0.1",

  "io.getquill"       %% "quill-core"             % quillVersion,
  "io.getquill"       %% "quill-cassandra"        % quillVersion,
  "io.monix"          %% "monix"                  % monixVersion,
  "io.monix"          %% "monix-eval"             % monixVersion,

  "com.websudos"        %%  "phantom-dsl"                 % phantomV,
  "com.websudos"        %%  "phantom-reactivestreams"     % phantomV
  // "com.websudos"        %%  "util-testing"                % phantomV    % "test, provided"
)

resolvers ++= Seq(
  Resolver.bintrayRepo("websudos", "oss-releases")
)

organization := "com.starbucks"
version := "1.0.0"
scalaVersion := scalaVer
scalacOptions ++= compileOptions
libraryDependencies ++= commonDependencies
