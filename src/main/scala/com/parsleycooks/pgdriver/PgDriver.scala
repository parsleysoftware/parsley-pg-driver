package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresProfile, PgArraySupport, PgDate2Support, PgEnumSupport, PgHStoreSupport}

trait PgDriver extends ExPostgresProfile
    with PgDate2Support
    with PgArraySupport
    with PgEnumSupport
    with PgHStoreSupport
{
  trait PgDriverAPI extends API with DateTimeImplicits with ArrayImplicits with SimpleArrayPlainImplicits with HStoreImplicits
  override val api = new PgDriverAPI {}
}

object PgDriver extends PgDriver
