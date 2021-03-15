package com.example.covid_19.countryListAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19.R
import com.example.covid_19.model.CountryEntity

class CountryListAdapter(
    private val itemClickListener: MyClickListener
) : ListAdapter<CountryEntity, CountryListAdapter.ViewHolder>(CountryListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), itemClickListener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val countryName: TextView = view.findViewById(R.id.country_name_txt)
        private val countryCode: TextView = view.findViewById(R.id.country_code_txt)

        fun bind(country: CountryEntity, clickListener: MyClickListener) {
            countryName.text = country.countryName
            countryCode.text = country.countryCode
            itemView.setOnClickListener {
                clickListener.onItemClicked(country)
            }
        }
    }
}

interface MyClickListener {
    fun onItemClicked(county: CountryEntity)
}
