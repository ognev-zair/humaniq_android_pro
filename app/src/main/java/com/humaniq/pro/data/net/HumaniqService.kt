package com.humaniq.pro.data.net

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable


interface HumaniqService {
  @GET("/users/{username}")
  fun getGithubUser(@Path("username") username: String): Observable<HumaniqService>
}