package com.example.kitsueasyclean.presentation.models

import android.os.Parcelable
import com.example.kitsueasyclean.domain.models.Titles
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TitlesUI(
    @SerializedName("en_jp")
    val enJp: String
): Parcelable

fun Titles.toUI(): TitlesUI {
    return TitlesUI(enJp)
}