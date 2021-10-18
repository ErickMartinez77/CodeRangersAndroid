package edu.upb.coderangersandroid.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.data.TempDataSource
import edu.upb.coderangersandroid.databinding.FragmentFeedBinding
import edu.upb.coderangersandroid.ui.adapters.FeedListAdapter


class FeedFragment : Fragment() {

    private val feedListAdapter = FeedListAdapter()
    private lateinit var binding: FragmentFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvFeed.adapter = feedListAdapter
        binding.rvFeed.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        feedListAdapter.addAll(TempDataSource.postList)
        feedListAdapter.setOnFeedItemClickListener {
            val directions = FeedFragmentDirections.actionGoToPostServiceDetail(it)
            findNavController().navigate(directions)
        }

    }

}