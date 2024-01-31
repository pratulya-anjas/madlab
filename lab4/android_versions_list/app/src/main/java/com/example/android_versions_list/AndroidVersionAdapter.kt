package com.example.android_versions_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AndroidVersionAdapter(context: Context, private val resource: Int, private val versions: List<AndroidVersion>) :
    ArrayAdapter<AndroidVersion>(context, resource, versions) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View =
            convertView ?: LayoutInflater.from(context).inflate(resource, parent, false)

        val version: AndroidVersion = getItem(position)!!

        val versionNameTextView: TextView = view.findViewById(R.id.versionNameTextView)
        val versionIconImageView: ImageView = view.findViewById(R.id.versionIconImageView)

        versionNameTextView.text = version.name
        versionIconImageView.setImageResource(version.iconResId)

        return view
    }
}