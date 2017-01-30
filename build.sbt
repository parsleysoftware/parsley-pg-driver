lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.14.1",
  "com.github.tminglei" %% "slick-pg_joda-time" % "0.14.1"
)