package com.example.covid_19.di

import com.example.covid_19.model.repository.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun provideRepository(): RepositoryImpl {
        return RepositoryImpl()
    }
}