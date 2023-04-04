package com.project.giphysearch.network

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GifServices {
    @GET("search?api_key=6xmMxy8L9Fq9KwpjSuBm692jOVen03Y7&limit=100&offset=0&rating=G&lang=en")
    fun getGifsList(
        @Query("q") query: String
    ): Single<com.project.giphysearch.data.Result>
}