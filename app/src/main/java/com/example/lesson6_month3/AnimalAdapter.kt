package com.example.lesson6_month3

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_animal.view.*

class AnimalAdapter : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    private var animals = arrayListOf<Animal>()

    class AnimalViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(animal: Animal){
            with(itemView){
                animal.run {
                    tv_name.text = name
                    tv_kind.text = kind
                    Glide.with(context).load(image).into(imageView)
                }
            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent,
            false)
        return AnimalViewHolder(view)

    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
//        holder.itemView.tv_name.text = animals[position].name
//        holder.itemView.tv_kind.text = animals[position].kind

          holder.bind(animals[position])
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list : ArrayList<Animal>){
        animals= list
        notifyDataSetChanged()
    }




}