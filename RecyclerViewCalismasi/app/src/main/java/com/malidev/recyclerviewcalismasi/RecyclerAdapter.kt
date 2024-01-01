package com.malidev.recyclerviewcalismasi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.malidev.recyclerviewcalismasi.model.SuperKahramanModel
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(var superKahramanListesi : ArrayList<SuperKahramanModel>)  : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>()  {
    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.RVTextView.text = superKahramanListesi.get(position).isim
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("isim",superKahramanListesi.get(position).isim)
            intent.putExtra("fotografId",superKahramanListesi.get(position).fotografId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return superKahramanListesi.size
    }
}