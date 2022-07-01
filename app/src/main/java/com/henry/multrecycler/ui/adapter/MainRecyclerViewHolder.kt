package com.henry.multrecycler.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.henry.multrecycler.databinding.ResAuthorBinding
import com.henry.multrecycler.databinding.ResHeaderBinding
import com.henry.multrecycler.model.MainRecyclerViewItem

sealed class MainRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root){

    class HeaderViewHolder(private val _binding: ResHeaderBinding) : MainRecyclerViewHolder(_binding){

        fun bind(header: MainRecyclerViewItem.Header){
            _binding.imageView.setImageResource(header.image)
        }
    }

    class AuthorViewHolder(private val _binding: ResAuthorBinding) : MainRecyclerViewHolder(_binding){

        fun bind(author: MainRecyclerViewItem.Author){
            with(_binding){
                tvAuthor.text = author.name
                tvAuthorRole.text = author.name
                imgAuthor.setImageResource(author.image)
            }
        }
    }
}