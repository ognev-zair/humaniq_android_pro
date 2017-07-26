package com.humaniq.pro.data.repository

import com.humaniq.pro.domain.model.Github
import com.humaniq.pro.domain.repository.GithubRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by gritsay on 7/26/17.
 */
class GithubDataRepository
@Inject constructor() : GithubRepository {


  override fun github(id: String): Observable<Github> {
    return github(id)
  }
}

