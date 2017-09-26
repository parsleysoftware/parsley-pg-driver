package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresProfile, PgArraySupport, PgDate2Support, PgEnumSupport}

trait PgDriver extends ExPostgresProfile
    with PgDate2Support
    with PgArraySupport
    with PgEnumSupport
{
  trait PgDriverAPI extends API with DateTimeImplicits with ArrayImplicits with SimpleArrayPlainImplicits
  override val api = new PgDriverAPI {}
}

object PgDriver extends PgDriver
