package com.mindorks.bootcamp.learndagger.ui.home

import androidx.lifecycle.MutableLiveData
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.FragmentScope
import com.mindorks.bootcamp.learndagger.ui.base.BaseViewModel
import com.mindorks.bootcamp.learndagger.ui.home.Post.Post
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable

import javax.inject.Inject

class HomeViewModel constructor(
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        private val databaseService: DatabaseService,
        private val networkService: NetworkService)
    : BaseViewModel(compositeDisposable, networkHelper) {

    val testData = MutableLiveData<List<Post>>()

    override fun onCreate() {
        testData.postValue(listOf(
                Post("Test 1"),
                Post("Test 2"),
                Post("Test 3"),
                Post("Test 4"),
                Post("Test 5"),
                Post("Test 6"),
                Post("Test 7")
        ))
    }
}
