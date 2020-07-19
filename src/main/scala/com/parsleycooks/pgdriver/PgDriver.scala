package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresProfile, PgArraySupport, PgDate2Support, PgEnumSupport, PgHStoreSupport, PgPlayJsonSupport}

trait PgDriver extends ExPostgresProfile
    with PgDate2Support
    with PgArraySupport
    with PgEnumSupport
    with PgHStoreSupport
    with PgPlayJsonSupport
{
  trait PgDriverAPI extends API
    with DateTimeImplicits
    with ArrayImplicits
    with SimpleArrayPlainImplicits
    with HStoreImplicits
    with PlayJsonImplicits

  val pgjson = "jsonb" // we're using new enough PG versions that more efficient jsonb is available

  super[PgDate2Support].bindPgDateTypesToScala[
    java.time.LocalDate, java.time.LocalTime, java.time.Instant,
    // OffsetTime isn't quite right, since it's a fixed offset instead of Zone, but PG doesn't support tz sanely anyway
    java.time.OffsetTime, java.time.Instant, java.time.Duration,
  ]

  override val api = new PgDriverAPI {}
}

object PgDriver extends PgDriver
