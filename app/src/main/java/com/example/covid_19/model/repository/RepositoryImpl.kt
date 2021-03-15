package com.example.covid_19.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.covid_19.di.DaggerDaggerComponent
import com.example.covid_19.model.CountryEntity
import com.example.covid_19.model.network.ApiRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class RepositoryImpl {
    @Inject
    lateinit var api: ApiRequest

    init {
        DaggerDaggerComponent.create().inject(this)
    }

    fun getCountriesListFromAPI(): LiveData<List<CountryEntity>> {
        val liveData = MutableLiveData<List<CountryEntity>>()

        api.getCountries().enqueue(object : Callback<List<CountryEntity>> {
            override fun onResponse(
                call: Call<List<CountryEntity>>,
                response: Response<List<CountryEntity>>
            ) {
                liveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<CountryEntity>>, t: Throwable) {
                t.printStackTrace()
            }
        })
        return liveData
    }


    //need errors handling here
//    @SuppressLint("CheckResult")
//    override fun getCountriesListFromAPI(): List<CountryEntity> {
//        api.getCountries().observeOn(AndroidSchedulers.mainThread())
//            .subscribeOn(Schedulers.io())
//            .subscribe({ response ->
//
//            }, { error ->
//                error.printStackTrace()
//            })
//        //bad
//        return emptyList()
//    }

}