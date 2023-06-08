package com.example.kitsueasyclean.domain.repositories

import com.example.kitsueasyclean.domain.models.DataItem
import com.example.kitsueasyclean.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    suspend fun fetchAnime(): Flow<Resource<List<DataItem>>>
}