package com.example.navigationcomponentodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev4.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.buttonGitA.setOnClickListener {
            git("A")
        }
        binding.buttonGitX.setOnClickListener {
            git("X")
        }





        return binding.root
    }

    private fun git(s:String) {
        if (s.equals("A")){
            Navigation.findNavController(binding.textView).navigate(R.id.action_anaSayfaFragment_to_AFragment)
        }else if (s.equals("X")){
            Navigation.findNavController(binding.textView).navigate(R.id.action_anaSayfaFragment_to_XFragment)
        }
    }



}