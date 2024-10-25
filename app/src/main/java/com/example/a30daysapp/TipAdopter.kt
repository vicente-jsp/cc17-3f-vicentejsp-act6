package com.example.a30daysapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val tipList: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayTextView: TextView = view.findViewById(R.id.dayTextView)
        val summaryTextView: TextView = view.findViewById(R.id.summaryTextView)
        val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tip_item, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tipList[position]
        holder.dayTextView.text = "Day ${tip.day}"
        holder.summaryTextView.text = tip.summary
        holder.descriptionTextView.text = tip.description
        holder.imageView.setImageResource(tip.imageResId)
    }

    override fun getItemCount() = tipList.size
}
