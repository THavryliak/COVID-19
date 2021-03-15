package com.example.covid_19.countryListAdapter

import androidx.recyclerview.widget.DiffUtil
import com.example.covid_19.model.CountryEntity

class CountryListDiffCallback: DiffUtil.ItemCallback<CountryEntity>() {
    override fun areItemsTheSame(oldItem: CountryEntity, newItem: CountryEntity): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CountryEntity, newItem: CountryEntity): Boolean {
        return oldItem == newItem
    }
}