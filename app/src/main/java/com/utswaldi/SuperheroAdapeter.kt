package com.utswaldi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class SuperheroAdapeter(private val dataList: ArrayList<Data>) :
    RecyclerView.Adapter<SuperheroAdapeter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_item_name)
        val imageId: ImageView = itemView.findViewById(R.id.img_item_photo)
        val deskripsi: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        return RecyclerViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentItem = dataList[position]

        holder.name.text = currentItem.name
        holder.imageId.setImageResource(currentItem.imageId)
        holder.deskripsi.text = currentItem.deskripsi
        

    }


    override fun getItemCount() = dataList.size
}
