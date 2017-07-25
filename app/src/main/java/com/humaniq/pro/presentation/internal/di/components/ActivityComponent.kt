package com.humaniq.pro.presentation.internal.di.components

import com.humaniq.pro.presentation.ui.main.MainActivity
import com.humaniq.pro.presentation.internal.di.modules.ActivityModule
import com.humaniq.pro.presentation.internal.di.scope.PerActivity
import dagger.Component

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 * [PerActivity]
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

  fun inject(mainActivity: MainActivity)
}
