package com.example.myrabbithole

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HololiveIdolListAdapter(val ListIdols : ArrayList<Idol>): RecyclerView.Adapter<HololiveIdolListAdapter.ListViewHolder>() {
  private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner  class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
      var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
      var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HololiveIdolListAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_listed_row, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: HololiveIdolListAdapter.ListViewHolder, position: Int) {
        val idols = ListIdols[position]
        Glide.with(holder.itemView.context)
            .load(idols.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = idols.name
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(ListIdols[holder.absoluteAdapterPosition]) }
    }

    override fun getItemCount(): Int {
        return ListIdols.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Idol)
    }
}

