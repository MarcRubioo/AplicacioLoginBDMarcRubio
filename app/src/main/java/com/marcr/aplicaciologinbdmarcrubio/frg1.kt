package com.marcr.aplicaciologinbdmarcrubio

import Frg1ViewModel
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.marcr.aplicaciologinbdmarcrubio.databinding.FragmentFrg1Binding
import org.w3c.dom.Text

class frg1  : Fragment() {

    private val viewModel: Frg1ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFrg1Binding.inflate(layoutInflater)
        binding.button.setOnClickListener{
            val user= binding.editTextUser.text
            val pass= binding.editTextPassword.text

            val comprovacio= viewModel.verifyUser(user,pass)

            if (comprovacio){
                findNavController().navigate(R.id.action_frg1_to_frg2, null)
            }
            else {
                Toast.makeText(binding.root.context, "Credencials Incorrectes!!! ", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}