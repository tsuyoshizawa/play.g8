lazy val root = (project in file("."))
.enablePlugins(PlayScala)
.settings(
  scalaVersion := "$scala_version$",
  scalacOptions := Seq("-language:_", "-deprecation", "-unchecked", "-feature", "-Xlint"),
  transitiveClassifiers in Global := Seq(Artifact.SourceClassifier),
  sources in (Compile, doc) := Nil,
  publishArtifact in (Compile, packageDoc) := false,
  javaOptions in Test += "-Dconfig.file=conf/test.conf",
  parallelExecution in Test := false
).settings(
  libraryDependencies ++= Seq(
    jdbc,
    cache,
    ws,
    filters
  )
)
