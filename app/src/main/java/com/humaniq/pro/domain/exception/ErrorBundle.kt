package com.humaniq.pro.domain.exception

import java.lang.Exception

/**
 * Created by gritsay on 7/26/17.
 */
/**
 * Interface to represent a wrapper around an [Exception] to manage errors.
 */
interface ErrorBundle {
  val exception: Exception

  val errorMessage: String
}
