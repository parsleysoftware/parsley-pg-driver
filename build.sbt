lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.11.8"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.15.1",

  "org.postgresql" % "postgresql" % "42.1.3"
)
