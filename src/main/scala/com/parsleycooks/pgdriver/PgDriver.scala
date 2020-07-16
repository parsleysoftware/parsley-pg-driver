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

  override val api = new PgDriverAPI {}
}

object PgDriver extends PgDriver
