package com.project.giphysearch.network

import com.project.giphysearch.repository.GifRepository
import com.project.giphysearch.viewmodel.GifViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GifViewModelModule {

    @Provides
    @Singleton
    fun provideGifServices(retrofit: Retrofit): GifServices = retrofit.create(GifServices::class.java)

    @Provides
    @Singleton
    fun provideGifRepository(gifServices: GifServices): GifRepository = GifRepository(gifServices)

    @Provides
    @Singleton
    fun provideViewModel(gifRepository: GifRepository): GifViewModel = GifViewModel(gifRepository)
}