package com.humaniq.pro.domain.exception

import java.lang.Exception

/**
 * Created by gritsay on 7/26/17.
 */

/**
 * Wrapper around Exceptions used to manage default errors.
 */
class DefaultErrorBundle(override val exception: Exception) : ErrorBundle {

  override val errorMessage: String
    get() = this.exception.message!!

}
