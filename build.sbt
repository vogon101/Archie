name := "Archie"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

mainClass in (Compile, run) := Some("com.vogonjeltz.archie.MainTest")