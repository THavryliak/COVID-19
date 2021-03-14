package com.example.covid_19.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.covid_19.R

class MainListFragment : Fragment(R.layout.fragment_main_list) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val myView = inflater.inflate(R.layout.fragment_main_list, container, false)

        myView.setOnClickListener {
            Navigation.findNavController(myView)
                .navigate(R.id.action_mainListFragment_to_detailsFragment)
        }

        return myView
    }
}