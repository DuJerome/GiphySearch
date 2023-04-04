package com.project.giphysearch.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.paging.PagingData
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.dushane.giphysearch.R
import com.dushane.giphysearch.databinding.FragmentMainBinding
import com.project.giphysearch.data.Gif
import com.project.giphysearch.viewmodel.GifViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentMain: Fragment(R.layout.fragment_main), SearchView.OnQueryTextListener {

    private lateinit var binding: FragmentMainBinding
    private val viewModel: GifViewModel by viewModels()
    private lateinit var adapter: RecyclerViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        adapter = RecyclerViewAdapter(context)
        binding.recyclerView.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerView.adapter = adapter
        binding.searchView.setOnQueryTextListener(this)
    }

    private fun getList(query: String): List<Gif> = viewModel.getGifs(query).blockingGet().data

    override fun onQueryTextSubmit(query: String): Boolean {
        adapter.submitData(lifecycle, PagingData.from(getList(query)))
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return true
    }
}