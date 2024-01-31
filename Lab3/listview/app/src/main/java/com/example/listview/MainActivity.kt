package com.example.listview

import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView: ListView = findViewById(R.id.listView)
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

        val adapter = ArrayAdapter(this, R.layout.list_item, R.id.textViewItem, items)
        listView.adapter = adapter

        // Set a click listener for the items
        listView.setOnItemClickListener { _, _, position, _ ->
            // Handle item click
            val selectedItem = items[position]
            Toast.makeText(this, "Clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}