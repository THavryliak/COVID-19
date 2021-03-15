package com.example.covid_19.model

import com.google.gson.annotations.SerializedName


data class CountryEntity(
    @SerializedName("Country")
    val countryName: String,

    @SerializedName("ISO2")
    val countryCode: String,
)

