package com.ihsan.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeroModel(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable