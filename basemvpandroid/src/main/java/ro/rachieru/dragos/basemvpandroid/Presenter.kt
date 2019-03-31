package ro.rachieru.dragos.basemvpandroid

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class Presenter/*<V : ViewDelegate>*/ : IPresenter/*<V>*/ {

//    override lateinit var viewDelegate: V

    private val compositeDisposable = CompositeDisposable()

    fun addDisposable(d: Disposable) {
        compositeDisposable.add(d)
    }

    override fun dispose() {
        compositeDisposable.dispose()
    }
}