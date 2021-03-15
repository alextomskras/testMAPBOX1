package com.dreamer.testmapbox1.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(
    val uid: String,
    val Request: String,
    val username: String,
    val profileImageUrl: String,
    val newToken: String
) : Parcelable {
    constructor() : this("", "", "", "", "")
}