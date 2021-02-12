lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.13.2"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.19.4",
  "com.github.tminglei" %% "slick-pg_play-json" % "0.19.4",

  "org.postgresql" % "postgresql" % "42.2.18"
)
