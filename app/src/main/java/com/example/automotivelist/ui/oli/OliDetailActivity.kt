package com.example.automotivelist.ui.oli

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.automotivelist.databinding.ActivityOliDetailBinding

class OliDetailActivity: AppCompatActivity() {
    private var _binding: ActivityOliDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "title"
        const val EXTRA_DESCRIPTION = "desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityOliDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageNDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val title = binding.titleDetail
        title.text = intent.getStringExtra(EXTRA_NAME)

        val desc = binding.descNDetail
        desc.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}