package com.example.kitsueasyclean.data.remote.apiservices

import com.example.kitsueasyclean.data.remote.dtos.DataItemDto
import com.example.kitsueasyclean.data.remote.dtos.ResponseDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun fetchAnime(): ResponseDto<DataItemDto>
}