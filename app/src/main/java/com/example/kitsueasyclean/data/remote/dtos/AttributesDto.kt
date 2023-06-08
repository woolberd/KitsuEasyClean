package com.example.kitsueasyclean.data.remote.dtos

import com.example.kitsueasyclean.domain.models.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("posterImage")
    val posterImage: PosterImageDto,
    @SerializedName("titles")
    val titles: TitlesDto
)

fun AttributesDto.toDomain(): Attributes {
    return Attributes(posterImage.toDomain(), titles.toDomain())
}