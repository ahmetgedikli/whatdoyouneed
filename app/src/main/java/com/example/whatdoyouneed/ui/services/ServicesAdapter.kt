package com.example.whatdoyouneed.ui.services

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatdoyouneed.R

class ServicesAdapter(val service : ArrayList<Service>): RecyclerView.Adapter<ServicesAdapter.ServiceHolder>() {
    class ServiceHolder(view: View): RecyclerView.ViewHolder(view){
        val serv_img=view.findViewById<ImageView>(R.id.images)
        val description=view.findViewById<TextView>(R.id.text)
        val seller=view.findViewById<TextView>(R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.service_view,
            parent, false)
        return ServiceHolder(layout)
    }

    override fun onBindViewHolder(holder: ServiceHolder, position: Int) {
        holder.serv_img.setImageResource(service.get(position).serv_img.toInt())
        holder.description.text=service.get(position).desc.toString()
        holder.seller.text=service.get(position).provider.toString()
    }

    override fun getItemCount(): Int {
        return service.size
    }
}