organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-bb83f3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-76f624",
  "org.scalablytyped" %%% "mime" % "2.0-38afc1",
  "org.scalablytyped" %%% "std" % "0.0-unknown-cd7da7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
