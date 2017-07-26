package com.humaniq.pro.domain.repository

import com.humaniq.pro.domain.model.Github
import rx.Observable


/**
 * Created by gritsay on 7/26/17.
 */
interface GithubRepository {

  fun github(id: String): Observable<Github>

  //fun githubList(page: Int?, perPage: Int?): Observable<List<Github>>
}