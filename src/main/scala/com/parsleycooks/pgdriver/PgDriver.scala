package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresDriver, PgArraySupport, PgDate2Support}

trait PgDriver extends ExPostgresDriver with PgDate2Support with PgArraySupport {
  override val api = new API with DateTimeImplicits with ArrayImplicits with SimpleArrayPlainImplicits
}

object PgDriver extends PgDriver
