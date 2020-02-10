package com.example.guatetourfr.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.guatetourfr.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)
        //homeViewModel.text.observe(this, Observer {
        //    textView.text = it
        //})
        val nombre: TextView = root.findViewById(R.id.textView3)
        val label: TextView = root.findViewById(R.id.textView2)
        val entrada: EditText = root.findViewById(R.id.editText)

        val floating: FloatingActionButton = root.findViewById(R.id.floatingActionButton)
        floating.setOnClickListener{
            if (nombre.isVisible) {
                entrada.visibility = View.VISIBLE
                label.visibility = View.VISIBLE
                nombre.visibility = View.INVISIBLE
            } else {
                entrada.visibility = View.INVISIBLE
                label.visibility = View.INVISIBLE
                nombre.text = entrada.text
                nombre.visibility = View.VISIBLE
            }
        }


        return root
    }
}