package com.example.automotivelist.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.automotivelist.databinding.ActivityHomeDetailBinding
import com.example.automotivelist.databinding.ActivityOliDetailBinding

class HomeDetailActivity: AppCompatActivity() {
    private var _binding: ActivityHomeDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "title"
        const val EXTRA_DESCRIPTION = "desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageNDetailHome
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val title = binding.titleDetailHome
        title.text = intent.getStringExtra(EXTRA_NAME)

        val desc = binding.descNDetailHome
        desc.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}