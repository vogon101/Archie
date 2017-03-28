name := "Archie"

version := "1.0"

scalaVersion := "2.11.1"

// https://mvnrepository.com/artifact/com.lihaoyi/fastparse_2.11
libraryDependencies += "com.lihaoyi" % "fastparse_2.11" % "0.4.2"

// https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.6"


mainClass in (Compile, run) := Some("com.vogonjeltz.archie.app.ConsoleApp")