package com.example.navigationcomponentodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev4.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding:FragmentXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentXBinding.inflate(inflater, container, false)

        binding.buttonXdenGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_XFragment_to_YFragment)
        }



        return binding.root
    }

}