package com.example.navigationcomponentodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationcomponentodev4.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding:FragmentYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentYBinding.inflate(inflater, container, false)

        val backPres=object :OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Navigation.findNavController(binding.textView5).navigate(R.id.action_YFragment_to_anaSayfaFragment)

            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPres)


        return binding.root
    }


}