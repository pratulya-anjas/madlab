package com.example.listandgridview

import androidx.appcompat.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val songs = arrayOf(
        "Song 1", "Song 2", "Song 3", "Song 4", "Song 5",
        "Song 6", "Song 7", "Song 8", "Song 9", "Song 10"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.songsListView)
        val gridView: GridView = findViewById(R.id.songsGridView)

        // Create ArrayAdapter for ListView
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, songs)
        listView.adapter = listAdapter

        // Set item click listener for ListView
        listView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedItem = songs[position]
            showToast("You selected: $selectedItem")
        })

        // Create ArrayAdapter for GridView
        val gridAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, songs)
        gridView.adapter = gridAdapter

        // Set item click listener for GridView
        gridView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedItem = songs[position]
            showToast("You selected: $selectedItem")
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}