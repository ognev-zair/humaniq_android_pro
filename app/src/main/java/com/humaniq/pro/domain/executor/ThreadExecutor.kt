package com.humaniq.pro.domain.executor

import java.util.concurrent.Executor

/**
 * Created by gritsay on 7/25/17.
 */
/**
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * [com.djuarez.rxkotlin.domain.usingcases.UseCase] out of the UI thread.
 */
interface ThreadExecutor : Executor