package com.example.navigationcomponentodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev4.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentABinding.inflate(inflater, container, false)

        binding.buttonGitB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)
        }







        return binding.root
    }

}