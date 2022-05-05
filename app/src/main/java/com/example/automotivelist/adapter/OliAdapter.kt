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
import com.example.automotivelist.model.OliDataModel
import com.example.automotivelist.ui.oli.OliDetailActivity
import com.example.automotivelist.ui.oli.OliViewModel

class OliAdapter (
    private val context: Context,
    private val dataset: List<OliDataModel>
) : RecyclerView.Adapter<OliAdapter.OliViewHolder>() {
    private val viewModel = OliViewModel()

    class OliViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.nImage)
        val titleText: TextView = view.findViewById(R.id.judulN)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OliViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.oli_item, parent, false)
        return OliViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: OliViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.titleText.text = context.resources.getString(item.titleResourceId)

        holder.view.setOnClickListener {
            viewModel.setData(item, context)
            val intent = Intent(context, OliDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("title", viewModel.title.value)
                putExtra("desc", viewModel.desc.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}