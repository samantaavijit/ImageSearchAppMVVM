package com.avijitsamanta.imagesearchappmvvm.data

import com.avijitsamanta.imagesearchappmvvm.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}