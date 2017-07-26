package com.humaniq.pro.presentation.ui.main.presenters

import com.humaniq.pro.domain.model.Github
import com.humaniq.pro.domain.usingcases.GithubUseCase
import com.humaniq.pro.presentation.internal.di.scope.PerActivity
import com.humaniq.pro.presentation.ui.main.views.MainView
import rx.lang.kotlin.FunctionSubscriber
import javax.inject.Inject

/**
 * Created by gritsay on 7/25/17.
 */
@PerActivity
    class MainPresenter @Inject
    constructor(private val githubUseCase: GithubUseCase) {
      var view: MainView? = null

          fun onCreate() {
            githubUseCase.setId("gritsay")
            githubUseCase.execute(FunctionSubscriber<Github>().onNext { view?.renderView(it) }.onError { view?.showError(it) })
          }
}