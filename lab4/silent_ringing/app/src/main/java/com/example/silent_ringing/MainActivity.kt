package com.example.silent_ringing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var toggleButton: ToggleButton
    lateinit var imageView: ImageView
    lateinit var actionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        imageView = findViewById(R.id.imageView)
        actionButton = findViewById(R.id.actionButton)

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                imageView.setImageResource(R.drawable.ic_ringing)
            } else {
                imageView.setImageResource(R.drawable.ic_silent)
            }
        }

        actionButton.setOnClickListener {
            val mode = if (toggleButton.isChecked) "Ringing" else "Silent"
            Toast.makeText(this, "Mode: $mode", Toast.LENGTH_SHORT).show()
        }
    }
}