lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

scalaVersion := "2.12.3"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.15.4",

  "org.postgresql" % "postgresql" % "42.1.3"
)
