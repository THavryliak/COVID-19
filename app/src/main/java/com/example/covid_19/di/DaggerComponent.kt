package com.example.covid_19.di

import com.example.covid_19.model.repository.RepositoryImpl
import com.example.covid_19.viewModel.MainViewModel
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        RepositoryModule::class
    ]
)
interface DaggerComponent {
    fun inject(repository: RepositoryImpl)
    fun inject(viewModel: MainViewModel)
}