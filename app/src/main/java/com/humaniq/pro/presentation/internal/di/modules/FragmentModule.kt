package com.humaniq.pro.presentation.internal.di.modules

import android.support.v4.app.Fragment
import com.humaniq.pro.presentation.internal.di.scope.PerFragment
import dagger.Module
import dagger.Provides

/**
 * Created by gritsay on 7/25/17.
 */
@Module
class FragmentModule(private val baseFragment: Fragment) {

  /**
   * Expose the activity to dependents in the graph.
   */
  @Provides
  @PerFragment
  fun provideFragment(): Fragment {
    return this.baseFragment
  }
}