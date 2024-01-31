package com.example.shop

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val groceryItems = arrayOf("Apple", "Banana", "Milk", "Bread", "Eggs", "Cheese", "Tomatoes")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.groceryListView)

        // Create an ArrayAdapter to populate the ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, groceryItems)
        listView.adapter = adapter

        // Set item click listener
        listView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedItem = groceryItems[position]
            showToast("You selected: $selectedItem")
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}