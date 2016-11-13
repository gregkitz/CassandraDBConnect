name := "ConnectToCassandra"

version := "1.0"

scalaVersion := "2.11.8"


lazy val phantomVersion = "2.0.3"

resolvers ++= Seq(
  "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
  "Twitter Repository"               at "http://maven.twttr.com",
  Resolver.typesafeRepo("releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.bintrayRepo("outworkers", "oss-releases")
)

libraryDependencies ++= Seq(
"com.outworkers"        %%  "phantom-dsl"                 % phantomVersion,
"com.outworkers"        %%  "phantom-reactivestreams"     % phantomVersion,
"com.websudos"        %%  "util-testing"                % "0.13.0"    % "test, provided"
)
