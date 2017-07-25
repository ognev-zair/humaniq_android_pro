package com.humaniq.pro.presentation.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.text
import pro.humaniq.com.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//  @Inject var mainPresenter: MainPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    text.text = "hello HUMANIQ PRO"
  }
}
