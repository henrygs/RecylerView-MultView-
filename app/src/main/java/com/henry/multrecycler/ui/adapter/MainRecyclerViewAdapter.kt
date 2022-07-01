package com.henry.multrecycler.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.henry.multrecycler.databinding.ResAuthorBinding
import com.henry.multrecycler.databinding.ResHeaderBinding
import com.henry.multrecycler.model.MainRecyclerViewItem

class MainRecyclerViewAdapter : RecyclerView.Adapter<MainRecyclerViewHolder>() {

    private var list = mutableListOf<MainRecyclerViewItem>()

    fun setData(list: MutableList<MainRecyclerViewItem>){
        this.list = list
        notifyDataSetChanged()
    }

    companion object{
        const val TIPO_AUTHOR = 0
        const val TIPO_HEADER = 1
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int = when(list[position]){
        is MainRecyclerViewItem.Author -> TIPO_AUTHOR
        is MainRecyclerViewItem.Header -> TIPO_HEADER
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder = when(viewType){
        TIPO_AUTHOR -> MainRecyclerViewHolder.AuthorViewHolder(
            ResAuthorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        TIPO_HEADER -> MainRecyclerViewHolder.HeaderViewHolder(
            ResHeaderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        else -> throw IllegalArgumentException("Tipo de view invalido")
    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) = when(holder){
        is MainRecyclerViewHolder.HeaderViewHolder -> holder.bind(list[position] as MainRecyclerViewItem.Header)
        is MainRecyclerViewHolder.AuthorViewHolder -> holder.bind(list[position] as MainRecyclerViewItem.Author)
    }

}