package com.avijitsamanta.imagesearchappmvvm.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.avijitsamanta.imagesearchappmvvm.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(private val repository: UnsplashRepository) :
    ViewModel() {
}