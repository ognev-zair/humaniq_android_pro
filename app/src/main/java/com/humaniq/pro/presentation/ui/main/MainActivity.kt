package com.humaniq.pro.presentation.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.humaniq.pro.AndroidApplication
import com.humaniq.pro.domain.model.Github
import com.humaniq.pro.presentation.internal.di.components.ActivityComponent
import com.humaniq.pro.presentation.internal.di.components.DaggerActivityComponent
import com.humaniq.pro.presentation.internal.di.modules.ActivityModule
import com.humaniq.pro.presentation.ui.main.presenters.MainPresenter
import com.humaniq.pro.presentation.ui.main.views.MainView
import kotlinx.android.synthetic.main.activity_main.publicRepos
import kotlinx.android.synthetic.main.activity_main.userName

import pro.humaniq.com.R
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {
  @Inject lateinit var mainPresenter:MainPresenter

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(R.layout.activity_main)
    component.inject(this)
    mainPresenter.view = this;
    mainPresenter.onCreate()
  }
  private val component: ActivityComponent
    get() = DaggerActivityComponent.builder()
        .applicationComponent((application as AndroidApplication).component)
        .activityModule(ActivityModule(this))
        .build()

  override fun renderView(github: Github) {
    userName.text = github?.name
    publicRepos.text = "Public Repos: " + github?.publicRepos
        .toString()
  }

  override fun showError(throwable: Throwable) {
    Toast.makeText(this, "Something was wrong", Toast.LENGTH_LONG).show()
  }

//  override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//    text.text = "hello HUMANIQ PRO"
//  }
}
