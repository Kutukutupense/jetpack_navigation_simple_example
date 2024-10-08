package com.eylem.nav_graph_deneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = SecondFragmentArgs.fromBundle(requireArguments())
        val name = args.name
        val age = args.age.toString()
        val btnSecondFragment = view.findViewById<Button>(R.id.btnSecondFragment)
            val twSecondFragment2 = view.findViewById<TextView>(R.id.twSecondFragment2)
        val fullinfo:String = "Name: $name Age: $age"
        twSecondFragment2.setText(fullinfo)
        btnSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_nav_graph_payment)
        }
    }
}