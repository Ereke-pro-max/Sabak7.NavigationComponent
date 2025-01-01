package com.example.sabak7navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sabak7navigationcomponent.databinding.FragmentCapitanBinding
import com.example.sabak7navigationcomponent.databinding.FragmentSpiderBinding

class spiderFragment : Fragment() {

    private  lateinit var binding: FragmentSpiderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpiderBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_spiderFragment_to_venomFragment)
        }

        binding.imageView3.setImageResource(R.drawable.spider)
    }
}