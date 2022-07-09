package com.example.tothemoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.tothemoon.databinding.FragmentEventBinding


class EventFragment : Fragment() {

    private lateinit var binding: FragmentEventBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_event, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_event, container, false)

        binding.button3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_eventFragment_to_eventPageFragment)
        )

        binding.button4.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_eventFragment_to_imageFragment)
        )

        return binding.root
    }


}