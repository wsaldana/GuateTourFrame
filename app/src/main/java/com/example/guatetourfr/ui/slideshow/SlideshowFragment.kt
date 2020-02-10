package com.example.guatetourfr.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.guatetourfr.R
import com.example.guatetourfr.databinding.FragmentSlideshowBinding
import android.content.Intent
import com.example.guatetourfr.Modelo

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val binding: FragmentSlideshowBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_slideshow,container,false)

        val key: String? = "tikal"

        var titulo: String = when(key){
            "tikal"->getString(R.string.titulo_tikal)
            "antigua"->getString(R.string.titulo_antigua)
            "xela"->getString(R.string.titulo_xela)
            else -> getString(R.string.titulo_tikal)
        }

        var frase: String = when(key){
            "tikal"->getString(R.string.frase_tikal)
            "antigua"->getString(R.string.frase_antigua)
            "xela"->getString(R.string.frase_xela)
            else->getString(R.string.frase_tikal)
        }

        var descr: String = when(key){
            "tikal"->getString(R.string.tikal)
            "antigua"->getString(R.string.antigua)
            "xela"->getString(R.string.xela)
            else->getString(R.string.tikal)
        }

        var modelo = Modelo()
        modelo.title = titulo
        modelo.phrase = frase
        modelo.description = descr

        binding.modelo=modelo

        return root
    }
}