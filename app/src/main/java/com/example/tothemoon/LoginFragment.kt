package com.example.tothemoon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.tothemoon.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding
    private val username = "badrul"
    private val pass = "12345"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener {
            if (binding.editTextTextPersonName.text.toString() == username && binding.editTextTextPassword.text.toString() == pass) {
               view.findNavController().navigate(R.id.action_loginFragment_to_eventFragment)
            } else{
                Toast.makeText(activity, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.button2.setOnClickListener {
            if (binding.editTextTextPersonName.text.toString() == username && binding.editTextTextPassword.text.toString() == pass) {
                Toast.makeText(activity, "Great....", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(activity, "Wrong....", Toast.LENGTH_SHORT).show()
            }
        }


    }


}