package com.example.test_25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test_25.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)



        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.buttonSend.setOnClickListener {
            (activity as MainActivity).passData(binding.editText.text.toString())
        }
    }
}