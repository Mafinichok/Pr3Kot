package com.example.pr3kot

import ViewMODELS.ViewMD1
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.example.pr3kot.databinding.FragmentFirstBinding


class FirstFrag : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    private lateinit var viewModel: ViewMD1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(ViewMD1::class.java)

        viewModel.name.observe(viewLifecycleOwner){
            binding.editTextTextTexttexttext11111111.setText(it)

        }


        val view: View = inflater!!.inflate(R.layout.fragment_first, container, false)

        var button = view.findViewById<Button>(R.id.buttonTptoFr2);

        button.setOnClickListener { view ->
            findNavController().navigate(R.id.action_firstFrag_to_secondFrag)

        }


        //var button2 = view.findViewById<Button>(R.id.buttonTptoFr3)
        binding.buttonTptoFr3.setOnClickListener { view ->
            val name = binding.editTextTextTexttexttext11111111.getText().toString()
            viewModel.setName(name)


            findNavController().navigate(R.id.action_firstFrag_to_tretiyFrag)

        }






        // Inflate the layout for this fragment
        return binding.root
    }
}