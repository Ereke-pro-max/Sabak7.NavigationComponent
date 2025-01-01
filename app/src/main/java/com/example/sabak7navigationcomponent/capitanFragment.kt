package com.example.sabak7navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sabak7navigationcomponent.databinding.FragmentCapitanBinding

class capitanFragment : Fragment() {

    private lateinit var binding: FragmentCapitanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCapitanBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_capitanFragment_to_spiderFragment)
        }
        binding.imageView5.setImageResource(R.drawable.capitan)
    }

}