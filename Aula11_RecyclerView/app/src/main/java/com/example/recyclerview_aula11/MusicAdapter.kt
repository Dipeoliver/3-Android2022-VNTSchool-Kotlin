package com.example.recyclerview_aula11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
    private val list: List<Album>,
    private val onItemclicked: (Album) -> Unit
) : RecyclerView.Adapter<MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music,parent,false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = list[position]
        holder.bind(music)
        holder.itemView.setOnClickListener {
            onItemclicked(music)
        }
    }

    override fun getItemCount(): Int = list.size
}

class MusicViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(product: Album) {
        view.apply {
            findViewById<ImageView>(R.id.imageview_item_music).setImageResource(product.image)
            findViewById<TextView>(R.id.textview_item_name).text = product.name
            findViewById<TextView>(R.id.textview_item_time).text = product.time
        }
    }
}