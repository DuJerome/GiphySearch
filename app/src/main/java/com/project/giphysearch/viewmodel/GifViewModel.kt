package com.project.giphysearch.viewmodel

import androidx.lifecycle.ViewModel
import com.project.giphysearch.data.Result
import com.project.giphysearch.repository.GifRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

@HiltViewModel
class GifViewModel @Inject constructor(
    private val gifRepository: GifRepository
): ViewModel() {
    fun getGifs(query: String): Single<Result> = gifRepository.getGifs(query)
}