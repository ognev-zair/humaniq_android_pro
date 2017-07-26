package com.humaniq.pro.domain.usingcases

import com.humaniq.pro.domain.executor.PostExecutionThread
import com.humaniq.pro.domain.executor.ThreadExecutor
import com.humaniq.pro.domain.model.Github
import com.humaniq.pro.domain.repository.GithubRepository
import rx.Observable
import javax.inject.Inject

/**
 * Created by gritsay on 7/26/17.
 */

class GithubUseCase @Inject constructor(threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread,
    private val githubRepository: GithubRepository) : UseCase<Github>(threadExecutor,
    postExecutionThread) {
  private var username: String = ""

  fun setId(username: String) {
    this.username = username
  }

  override fun buildUseCaseObservable(): Observable<Github> {
    return this.githubRepository.github("")
  }
}