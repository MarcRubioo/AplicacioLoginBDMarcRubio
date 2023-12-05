package com.marcr.aplicaciologinbdmarcrubio

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marcr.aplicaciologinbdmarcrubio.databinding.FragmentFrg1Binding

class frg1  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFrg1Binding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_frg1_to_frg2, null)
        }
        return binding.root
    }
}