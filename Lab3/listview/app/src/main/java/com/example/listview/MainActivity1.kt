package com.example.listview

import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.MainActivity1)

        val gridView: GridView = findViewById(R.id.gridView)
        val artists = arrayOf("Artist 1", "Artist 2", "Artist 3", "Artist 4", "Artist 5")

        val adapter = ArrayAdapter(this, R.layout.grid_item, R.id.textViewArtistName, artists)
        gridView.adapter = adapter

        // Set a click listener for the items
        gridView.setOnItemClickListener { _, _, position, _ ->
            // Handle item click
            val selectedArtist = artists[position]
            // Do something with the selected artist
        }
    }
}