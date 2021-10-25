package edu.upb.coderangersandroid.ui.mainpage.tabs.store

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import edu.upb.coderangersandroid.data.StoreDataSource
import edu.upb.coderangersandroid.databinding.FragmentStoreBinding

class StoreFragment: Fragment() {

    private val storeListAdapter = StoreListAdapter()
    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvStore.adapter = storeListAdapter
        binding.rvStore.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        storeListAdapter.addAll(StoreDataSource.productList)

    }
}