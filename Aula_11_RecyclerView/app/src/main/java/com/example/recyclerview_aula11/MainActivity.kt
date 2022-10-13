package com.example.recyclerview_aula11

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter = MusicAdapter(MusicaData().loadItems()) { product ->
            Toast.makeText(this, "'${product.name}' clicked", Toast.LENGTH_SHORT).show()
        }
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayout.VERTICAL))
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}