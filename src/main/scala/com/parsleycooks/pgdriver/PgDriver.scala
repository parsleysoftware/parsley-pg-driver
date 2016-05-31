package com.parsleycooks.pgdriver

import com.github.tminglei.slickpg.{ExPostgresDriver, PgDateSupportJoda}

trait PgDriver extends ExPostgresDriver with PgDateSupportJoda {
  override val api = new API with DateTimeImplicits
}

object PgDriver extends PgDriver
