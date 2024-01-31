package com.example.android_versions_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class AndroidVersionListFragment : ListFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_android_version_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val versions = listOf(
            AndroidVersion("Android 1.0", R.drawable.ic_android_1),
            AndroidVersion("Android 1.1", R.drawable.ic_android_1),
            AndroidVersion("Cupcake", R.drawable.ic_android_cupcake),
            AndroidVersion("Donut", R.drawable.ic_android_donut),
            // Add more Android versions as needed
        )

        val adapter = AndroidVersionAdapter(requireContext(), R.layout.android_version_item, versions)
        listAdapter = adapter
    }
}