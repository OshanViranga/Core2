package com.example.core2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(val name: String, val date: String,
                    val rating: Float, val resId: Int): Parcelable {
}