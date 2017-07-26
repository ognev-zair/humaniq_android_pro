package com.humaniq.pro.presentation.ui.main.views

import com.humaniq.pro.domain.model.Github

/**
 * Created by gritsay on 7/25/17.
 */
interface MainView {
  fun renderView(github: Github)
  fun showError(throwable: Throwable)

}