package com.humaniq.pro.presentation.internal.di.components

import android.content.Context
import com.humaniq.pro.AndroidApplication
import com.humaniq.pro.domain.executor.PostExecutionThread
import com.humaniq.pro.domain.executor.ThreadExecutor
import com.humaniq.pro.presentation.navigation.Navigator
import com.humaniq.pro.presentation.internal.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

  fun inject(androidApplication: AndroidApplication)

  val androidApplication: AndroidApplication

  fun context(): Context

  fun navigator(): Navigator

  fun threadExecutor(): ThreadExecutor

  fun postExecutionThread(): PostExecutionThread

  //fun githubRepository(): GithubRepository
}
