package com.project.giphysearch.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dushane.giphysearch.R
import com.project.giphysearch.data.Gif

class RecyclerViewAdapter(
    private val context: Context?
): PagingDataAdapter<Gif, RecyclerViewAdapter.ViewHolder>(COMPARATOR) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageViewGif: ImageView = view.findViewById(R.id.imageViewGif)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context!!)
            .asGif()
            .load(getItem(position)?.images?.original?.url)
            .into(holder.imageViewGif)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_gif, parent, false)
        return ViewHolder(view)
    }

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Gif>() {
            override fun areItemsTheSame(oldItem: Gif, newItem: Gif): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Gif, newItem: Gif): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}