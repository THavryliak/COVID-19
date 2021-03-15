package com.example.covid_19.di

import com.example.covid_19.model.network.ApiRequest
import com.example.covid_19.model.network.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun retrofitService(): ApiRequest {
        return Retrofit.Builder()
            .baseUrl(ApiService.BASE_URL)
            //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiRequest::class.java)
    }
}