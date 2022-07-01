package com.henry.multrecycler.model

sealed class MainRecyclerViewItem{

    class Header(
        val image: Int
    ) : MainRecyclerViewItem()

    class Author(
        val name: String,
        val role: String,
        val image: Int
    ) : MainRecyclerViewItem()

}
