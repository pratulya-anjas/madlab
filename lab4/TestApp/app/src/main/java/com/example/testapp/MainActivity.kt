package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showButtonToast(view: android.view.View) {
        val toast = Toast(applicationContext)
        val toastView = layoutInflater.inflate(R.layout.custom_toast, null)
        toast.view = toastView

        val imageView: ImageView = toastView.findViewById(R.id.toastImageView)
        imageView.setImageResource(R.drawable.ic_button_toast)

        val textView: TextView = toastView.findViewById(R.id.toastText)
        textView.text = "Button Toast"

        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.duration = Toast.LENGTH_SHORT
        toast.show()
    }

    fun showToggleButtonToast(view: android.view.View) {
        val toast = Toast(applicationContext)
        val toastView = layoutInflater.inflate(R.layout.custom_toast, null)
        toast.view = toastView

        val imageView: ImageView = toastView.findViewById(R.id.toastImageView)
        imageView.setImageResource(R.drawable.ic_toggle_toast)

        val textView: TextView = toastView.findViewById(R.id.toastText)
        textView.text = "Toggle Button Toast"

        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.duration = Toast.LENGTH_SHORT
        toast.show()
    }
}