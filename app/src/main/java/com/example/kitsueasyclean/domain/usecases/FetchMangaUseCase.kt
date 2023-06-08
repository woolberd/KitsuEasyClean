package com.example.kitsueasyclean.domain.usecases

import com.example.kitsueasyclean.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {

    suspend operator fun invoke() = mangaRepository.fetchManga()
}