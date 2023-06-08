package com.example.kitsueasyclean.di

import com.example.kitsueasyclean.data.repositories.AnimeRepositoryImpl
import com.example.kitsueasyclean.data.repositories.MangaRepositoryImpl
import com.example.kitsueasyclean.domain.repositories.AnimeRepository
import com.example.kitsueasyclean.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideMangaRepository(repositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    fun provideAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository
}