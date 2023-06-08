package com.example.kitsueasyclean.data.repositories

import com.example.kitsueasyclean.data.remote.apiservices.AnimeApiService
import com.example.kitsueasyclean.data.remote.dtos.toDomain
import com.example.kitsueasyclean.data.base.BaseRepository
import com.example.kitsueasyclean.domain.repositories.AnimeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = doRequest {
        animeApiService.fetchAnime().data.map {
            it.toDomain()
        }
    }
}