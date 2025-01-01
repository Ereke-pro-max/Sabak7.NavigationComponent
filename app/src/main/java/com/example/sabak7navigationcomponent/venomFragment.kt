package com.example.sabak7navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sabak7navigationcomponent.databinding.FragmentVenomBinding

class venomFragment : Fragment() {

    private lateinit var binding: FragmentVenomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVenomBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_venomFragment_to_ironFragment)
        }
        binding.imageView4.setImageResource(R.drawable.venom)
    }

}