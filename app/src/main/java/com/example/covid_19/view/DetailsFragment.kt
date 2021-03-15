package com.example.covid_19.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.covid_19.R

class DetailsFragment : Fragment(R.layout.fragment_details) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val myView = inflater.inflate(R.layout.fragment_details, container, false)

        myView.setOnClickListener {
            Navigation.findNavController(myView)
                .navigate(R.id.action_detailsFragment_to_mainListFragment)
        }

        return myView
    }
}