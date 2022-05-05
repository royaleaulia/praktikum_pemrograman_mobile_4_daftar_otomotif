package com.example.automotivelist.ui.gallery

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.automotivelist.databinding.ActivityGalleryDetailBinding


class GalleryDetailActivity: AppCompatActivity() {

    private var _binding: ActivityGalleryDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.galleryimageNDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))



    }
}