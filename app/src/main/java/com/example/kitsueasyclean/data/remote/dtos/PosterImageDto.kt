package com.example.kitsueasyclean.data.remote.dtos

import com.example.kitsueasyclean.domain.models.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("original")
    val original: String,
    @SerializedName("large")
    val large: String
)

fun PosterImageDto.toDomain(): PosterImage {
    return PosterImage(original, large)
}