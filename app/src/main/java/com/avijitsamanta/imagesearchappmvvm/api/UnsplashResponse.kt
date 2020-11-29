package com.avijitsamanta.imagesearchappmvvm.api

import com.avijitsamanta.imagesearchappmvvm.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
