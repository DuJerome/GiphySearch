package com.project.giphysearch.repository

import com.project.giphysearch.network.GifServices
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GifRepository @Inject constructor(
    private val gifServices: GifServices
){
    fun getGifs(query: String): Single<com.project.giphysearch.data.Result> = gifServices.getGifsList(query)
}