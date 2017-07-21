package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresProfile, PgArraySupport, PgDate2Support}

trait PgDriver extends ExPostgresProfile with PgDate2Support with PgArraySupport {
  override val api = new API with DateTimeImplicits with ArrayImplicits with SimpleArrayPlainImplicits
}

object PgDriver extends PgDriver
