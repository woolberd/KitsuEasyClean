package com.example.kitsueasyclean.presentation.ui.fragments.manga

import androidx.lifecycle.ViewModel
import com.example.kitsueasyclean.domain.usecases.FetchMangaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase
) : ViewModel() {

    suspend fun fetchManga() = fetchMangaUseCase.invoke()
}