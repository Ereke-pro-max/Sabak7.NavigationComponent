package com.example.sabak7navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sabak7navigationcomponent.databinding.FragmentHulkBinding
import com.example.sabak7navigationcomponent.databinding.FragmentIronBinding

class IronFragment : Fragment() {

    private lateinit var binding: FragmentIronBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIronBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_ironFragment_to_hulkFragment)
        }
        binding.imageView.setImageResource(R.drawable.iron)
    }
}