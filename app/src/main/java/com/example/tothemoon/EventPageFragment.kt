package com.example.tothemoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tothemoon.databinding.FragmentEventPageBinding


class EventPageFragment : Fragment() {

    private lateinit var binding: FragmentEventPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_event_page, container, false)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_event_page, container, false)
        binding.imageView4.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_eventPageFragment_to_mapsFragment)
        )

        return binding.root

    }



}