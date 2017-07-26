package com.humaniq.pro.presentation.internal.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.humaniq.pro.AndroidApplication
import com.humaniq.pro.UIThread
import com.humaniq.pro.data.executor.JobExecutor
import com.humaniq.pro.data.repository.GithubDataRepository
import com.humaniq.pro.domain.executor.PostExecutionThread
import com.humaniq.pro.domain.executor.ThreadExecutor
import com.humaniq.pro.domain.repository.GithubRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gritsay on 7/25/17.
 */

@Module
class ApplicationModule(private val androidApplication: AndroidApplication) {

  @Provides
  @Singleton
  fun application(): AndroidApplication {
    return androidApplication;
  }

  @Provides
  @Singleton
  fun provideApplicatonContext(): Context {
    return androidApplication;
  }

  @Provides
  @Singleton
  fun ProvideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
    return jobExecutor
  }

  @Provides
  @Singleton
  fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread {
    return uiThread
  }

  @Provides
  @Singleton
  fun provideSharedPreferences(): SharedPreferences {
    return androidApplication.getSharedPreferences("app", Context.MODE_APPEND)
  }

  @Provides
  @Singleton
  fun provideGithubRepository(dataRepository: GithubDataRepository): GithubRepository {
    return dataRepository

  }
}