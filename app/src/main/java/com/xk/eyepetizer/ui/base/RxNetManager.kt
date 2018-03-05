package com.xk.eyepetizer.ui.base

import io.reactivex.disposables.Disposable

/**
 * Created by csy on 2017/8/23.
 */
interface RxNetManager {

    fun dispose(disposable: Disposable)
    fun addDisposable(disposable: Disposable)
}