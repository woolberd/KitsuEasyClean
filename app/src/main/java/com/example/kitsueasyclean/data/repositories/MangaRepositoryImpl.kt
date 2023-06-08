package com.example.kitsueasyclean.data.repositories

import com.example.kitsueasyclean.data.remote.apiservices.MangaApiService
import com.example.kitsueasyclean.data.remote.dtos.toDomain
import com.example.kitsueasyclean.domain.base.BaseRepository
import com.example.kitsueasyclean.domain.repositories.MangaRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    override suspend fun fetchManga() = doRequest {
        mangaApiService.fetchManga().data.map {
            it.toDomain()
        }
    }
}