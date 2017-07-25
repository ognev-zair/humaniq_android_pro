package com.humaniq.pro.data.net

import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * [RestApi] implementation for retrieving data from the network.
 */
@Singleton
class RestApi @Inject constructor() {

  private val service: HumaniqService

  init {
    val builder = OkHttpClient.Builder().addInterceptor(getLogginInterceptor())
    val retro = Retrofit.Builder().baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .client(builder.build()).build()
    service = retro.create(HumaniqService::class.java)
  }

  fun githubUser(id: String): Observable<HumaniqService> {
    return service.getGithubUser(id);
  }

  fun getLogginInterceptor(): Interceptor {
    val interceptor = HttpLoggingInterceptor()
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    return interceptor
  }

}