package com.eylem.nav_graph_deneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val name:String = "Eylem"
        val age:Int = 35
        val btnFirstFragment = view.findViewById<Button>(R.id.btnFirstFragment)
        btnFirstFragment.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(name,age)
            findNavController().navigate(action)
        }


    }
}