package com.example.kitsueasyclean.presentation.models

import android.os.Parcelable
import com.example.kitsueasyclean.domain.models.PosterImage
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PosterImageUI(
    @SerializedName("original")
    val original: String,
    @SerializedName("large")
    val large: String
): Parcelable

fun PosterImage.toUI(): PosterImageUI {
    return PosterImageUI(original, large.toString())
}