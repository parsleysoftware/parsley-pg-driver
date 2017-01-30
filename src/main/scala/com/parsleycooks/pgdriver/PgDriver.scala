package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresDriver, PgArraySupport, PgDateSupportJoda}

trait PgDriver extends ExPostgresDriver with PgDateSupportJoda with PgArraySupport {
  override val api = new API with DateTimeImplicits with ArrayImplicits with SimpleArrayPlainImplicits
}

object PgDriver extends PgDriver
