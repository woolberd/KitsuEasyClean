package com.example.kitsueasyclean.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class ResponseDto<T>(
    @SerializedName("data")
    val data: List<T>
)