lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.13.16"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.22.2",
  "com.github.tminglei" %% "slick-pg_play-json" % "0.22.2",

  "org.postgresql" % "postgresql" % "42.7.7"
)
