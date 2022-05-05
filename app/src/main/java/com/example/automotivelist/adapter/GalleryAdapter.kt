package com.example.automotivelist.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.automotivelist.R
import com.example.automotivelist.model.GalleryDataModel
import com.example.automotivelist.ui.gallery.GalleryDetailActivity
import com.example.automotivelist.ui.gallery.GalleryViewModel

class GalleryAdapter (
    private val context: Context,
    private val dataset: List<GalleryDataModel>
    ): RecyclerView.Adapter<GalleryAdapter.galleryViewHolder>(){
        private val viewModel = GalleryViewModel()

    class galleryViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.id_image_gallery)
        val textMerek: TextView = view.findViewById(R.id.id_text_merek)
        val textType: TextView = view.findViewById(R.id.id_text_type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): galleryViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gallery_item, parent, false)
        return galleryViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: galleryViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.ImageResId)
        holder.textMerek.text = context.resources.getString(item.MerekResId)
        holder.textType.text = context.resources.getString(item.TypeResId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, GalleryDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("merek", viewModel.merek.value)
                putExtra("type", viewModel.type.value)
            }
            context.startActivity(intent)
        }

    }
    override fun getItemCount() = dataset.size
}