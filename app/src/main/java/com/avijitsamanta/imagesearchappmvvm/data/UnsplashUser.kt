package com.avijitsamanta.imagesearchappmvvm.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashUser(
    val id: String,
    val username: String,
    val name: String,
    val profile_image: UnsplashUserProfileImage
) : Parcelable {
    @Parcelize
    data class UnsplashUserProfileImage(
        val small: String?,
        val medium: String?,
        val large: String?
    ) : Parcelable

    val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
}