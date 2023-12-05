package com.marcr.aplicaciologinbdmarcrubio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.marcr.aplicaciologinbdmarcrubio.databinding.FragmentFrg2Binding

class frg2 : Fragment() {

    private val viewModel: Frg2ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFrg2Binding.inflate(layoutInflater)

        viewModel.next()

        binding.textViewNom.text = viewModel.nom
        binding.textViewEdat.text = viewModel.edat.toString()
        binding.textViewCorreu.text = viewModel.correu

        binding.containerView.setOnClickListener {
            viewModel.next()
            binding.textViewNom.text = viewModel.nom
            binding.textViewEdat.text = viewModel.edat.toString()
            binding.textViewCorreu.text = viewModel.correu
        }

        return binding.root
    }
}


