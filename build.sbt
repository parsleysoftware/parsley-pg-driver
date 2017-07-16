lazy val `parsley-pg-driver` = project in file(".")

name := "parsley-pg-driver"

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % "0.15.1",
  "com.github.tminglei" %% "slick-pg_date2" % "0.15.1",

  "org.postgresql" % "postgresql" % "42.1.3"
)