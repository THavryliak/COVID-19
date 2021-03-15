package com.example.covid_19.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19.R
import com.example.covid_19.countryListAdapter.CountryListAdapter
import com.example.covid_19.countryListAdapter.MyClickListener
import com.example.covid_19.model.CountryEntity
import com.example.covid_19.viewModel.MainViewModel


class MainListFragment : Fragment(R.layout.fragment_main_list), MyClickListener {

    //inject ViewModel... factory or sth else
    private val model = MainViewModel()

    private var adapter = CountryListAdapter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.country_recycler)
        recycler.adapter = adapter

        model.getCountryList()
        model.getCountryList().observe(viewLifecycleOwner) {
            setData(it)
        }
    }

    private fun setData(data: List<CountryEntity>) {
        adapter.submitList(data)
    }

    override fun onItemClicked(county: CountryEntity) {
        findNavController().navigate(R.id.action_mainListFragment_to_detailsFragment)
    }
}