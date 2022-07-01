package com.henry.multrecycler.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.henry.multrecycler.R
import com.henry.multrecycler.databinding.ActivityMainBinding
import com.henry.multrecycler.model.MainRecyclerViewItem
import com.henry.multrecycler.ui.adapter.MainRecyclerViewAdapter
import com.henry.multrecycler.ui.adapter.MainRecyclerViewHolder

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    private val _adapter: MainRecyclerViewAdapter = MainRecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.rvMain.setHasFixedSize(true)
        _binding.rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
        _binding.rvMain.adapter = _adapter

        _adapter.setData(getData())
    }

    private fun getData(): MutableList<MainRecyclerViewItem> {
        val list = mutableListOf<MainRecyclerViewItem>()

        list.add(MainRecyclerViewItem.Header(R.drawable.img_1))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 1 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 2 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Header(R.drawable.img_1))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 1 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 2 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 3 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 4 ", "Ben Kenobi", R.drawable.img))
        list.add(MainRecyclerViewItem.Author("Ewan McGregor 5 ", "Ben Kenobi", R.drawable.img))

        return list
    }
}