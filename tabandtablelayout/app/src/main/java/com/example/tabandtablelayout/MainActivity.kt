package com.example.tabandtablelayout

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private val songs = arrayOf(
        "Song 1", "Song 2", "Song 3", "Song 4", "Song 5",
        "Song 6", "Song 7", "Song 8", "Song 9", "Song 10"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val tableLayout: TableLayout = findViewById(R.id.tableLayout)

        // Add tabs to TabLayout
        for (i in 0 until songs.size) {
            tabLayout.addTab(tabLayout.newTab().setText("Category $i"))
        }

        // Add table rows dynamically
        for (i in 0 until songs.size) {
            val tableRow = TableRow(this)
            val textView = TextView(this)
            textView.text = songs[i]
            tableRow.addView(textView)
            tableLayout.addView(tableRow)
        }

        // Set TabLayout listener
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                // Handle tab selection if needed
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselection if needed
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselection if needed
            }
        })
    }
}