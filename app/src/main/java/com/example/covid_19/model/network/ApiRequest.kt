package com.example.covid_19.model.network

import com.example.covid_19.model.CountryEntity
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequest {

    @GET("countries")
    fun getCountries(): Call<List<CountryEntity>>
}