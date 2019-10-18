lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.12.10"
crossScalaVersions := Seq("2.12.10", "2.13.1")

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.18.0",

  "org.postgresql" % "postgresql" % "42.2.8"
)
