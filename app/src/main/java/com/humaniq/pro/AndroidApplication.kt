package com.humaniq.pro

import android.app.Application
import android.content.Context
import com.humaniq.pro.presentation.internal.di.components.ApplicationComponent
import com.humaniq.pro.presentation.internal.di.components.DaggerApplicationComponent
import com.humaniq.pro.presentation.internal.di.modules.ApplicationModule


/**
 * Created by gritsay on 7/25/17.
 */
class AndroidApplication : Application() {

  val component: ApplicationComponent
    get() = DaggerApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()

  override fun onCreate() {
    super.onCreate()

    component.inject(this)
  }


  companion object {

    operator fun get(context: Context): AndroidApplication {
      return context.applicationContext as AndroidApplication
    }
  }
}