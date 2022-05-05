package com.example.automotivelist.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.automotivelist.R
import com.example.automotivelist.model.HomeDataModel
import com.example.automotivelist.ui.home.HomeDetailActivity
import com.example.automotivelist.ui.home.HomeViewModel

class HomeAdapter (
    private val context: Context,
    private val dataset: List<HomeDataModel>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private val viewModel = HomeViewModel()

    class HomeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.ImagehomeN)
        val titleText: TextView = view.findViewById(R.id.judulhomeN)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.home_item, parent, false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.HomeImageResourceId)
        holder.titleText.text = context.resources.getString(item.HomenameResourceId)



        holder.view.setOnClickListener {
            viewModel.setData(item, context)
            val intent = Intent(context, HomeDetailActivity::class.java).apply {
                putExtra("image", viewModel.imagehome.value)
                putExtra("title", viewModel.judulhome.value)
                putExtra("desc", viewModel.deschome.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}