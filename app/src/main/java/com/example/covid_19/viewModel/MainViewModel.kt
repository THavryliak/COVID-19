package com.example.covid_19.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.covid_19.di.DaggerDaggerComponent
import com.example.covid_19.model.CountryEntity
import com.example.covid_19.model.repository.RepositoryImpl
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var repository: RepositoryImpl

    init {
        DaggerDaggerComponent.create().inject(this)
    }

    fun getCountryList(): LiveData<List<CountryEntity>> {
        return repository.getCountriesListFromAPI()
    }

}