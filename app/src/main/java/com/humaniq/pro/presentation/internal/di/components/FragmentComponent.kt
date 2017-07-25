package com.humaniq.pro.presentation.internal.di.components

import com.humaniq.pro.presentation.internal.di.modules.FragmentModule
import com.humaniq.pro.presentation.internal.di.scope.PerFragment
import dagger.Component

/**
 * Created by gritsay on 7/25/17.
 */
@PerFragment
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(FragmentModule::class))
interface FragmentComponent
