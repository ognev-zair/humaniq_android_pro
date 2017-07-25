package com.humaniq.pro.presentation.internal.di.modules

import android.app.Activity
import com.humaniq.pro.presentation.internal.di.scope.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by gritsay on 7/25/17.
 */

@Module
class ActivityModule(private val baseActivity: Activity) {
  /**
  * Expose the activity to dependents in the graph.
  */
  @Provides
  @PerActivity
  internal fun provideActivity(): Activity {
    return this.baseActivity
  }
}