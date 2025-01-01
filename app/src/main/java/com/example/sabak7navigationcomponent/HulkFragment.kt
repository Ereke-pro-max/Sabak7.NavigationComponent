package com.example.sabak7navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sabak7navigationcomponent.databinding.FragmentHulkBinding

class HulkFragment : Fragment() {

    private lateinit var binding: FragmentHulkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHulkBinding.inflate(layoutInflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnHulk.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_capitanFragment)
        }
        binding.imageView2.setImageResource(R.drawable.hulk)
    }
}