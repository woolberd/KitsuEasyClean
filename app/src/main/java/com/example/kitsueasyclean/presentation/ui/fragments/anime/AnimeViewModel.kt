package com.example.kitsueasyclean.presentation.ui.fragments.anime

import androidx.lifecycle.ViewModel
import com.example.kitsueasyclean.domain.usecases.FetchAnimeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : ViewModel() {

   suspend fun fetchAnime() = fetchAnimeUseCase.invoke()
}