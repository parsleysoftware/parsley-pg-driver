lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.13.2"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.19.0",

  "org.postgresql" % "postgresql" % "42.2.8"
)
