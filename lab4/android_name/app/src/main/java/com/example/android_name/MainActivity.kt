package com.example.android_name

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: android.view.View) {
        val versionName = (view as Button).text.toString()
        val versionIcon = when (versionName) {
            "Android 10" -> R.drawable.ic_android_10
            // Add cases for other Android versions as needed
            else -> R.drawable.ic_launcher_foreground // Default icon
        }

        val toast = Toast.makeText(applicationContext, versionName, Toast.LENGTH_SHORT)
        val toastView = toast.view
        if (toastView != null) {
            toastView.setBackgroundResource(R.drawable.toast_background)
        }

        // Set the custom layout for the Toast
        val customLayout = layoutInflater.inflate(R.layout.custom_toast, null)
        toast.view = customLayout

        // Set the version name and icon in the custom Toast layout
        customLayout.findViewById<Button>(R.id.btnVersion).text = versionName

        // Access the ImageView using a temporary variable
        val tempImageView: ImageView = customLayout.findViewById(R.id.imageVersion)
        tempImageView.setImageResource(versionIcon)

        toast.show()
    }
}