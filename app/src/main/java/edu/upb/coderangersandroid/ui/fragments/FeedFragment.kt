package edu.upb.coderangersandroid.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.data.TempDataSource
import edu.upb.coderangersandroid.ui.adapters.FeedListAdapter


class FeedFragment : Fragment() {

    private val feedListAdapter = FeedListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvFeed)
        recyclerView.adapter = feedListAdapter
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        feedListAdapter.addAll(TempDataSource.postList)

    }

}