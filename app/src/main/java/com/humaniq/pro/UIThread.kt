package com.humaniq.pro

import com.humaniq.pro.domain.executor.PostExecutionThread
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by gritsay on 7/25/17.
 */
@Singleton
class UIThread
@Inject
constructor() : PostExecutionThread {

  override val scheduler: Scheduler
    get() = AndroidSchedulers.mainThread()
}
