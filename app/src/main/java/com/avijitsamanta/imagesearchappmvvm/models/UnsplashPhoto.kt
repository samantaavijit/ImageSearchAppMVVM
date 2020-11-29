package com.avijitsamanta.imagesearchappmvvm.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val user: UnsplashUser,
    val urls: UnsplashPhotoUrls
) : Parcelable {
}