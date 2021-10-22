package edu.upb.coderangersandroid.ui.mainpage.tabs.feed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import edu.upb.coderangersandroid.databinding.FragmentFeedBinding


class FeedFragment : Fragment() {

    private val feedListAdapter = FeedListAdapter()
    private lateinit var binding: FragmentFeedBinding
    private val postViewModel: PostViewModel by activityViewModels()

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
        feedListAdapter.setOnFeedItemClickListener {
            val directions = FeedFragmentDirections.actionGoToPostServiceDetail(it)
            findNavController().navigate(directions)
        }
        postViewModel.post.observe(viewLifecycleOwner){
            feedListAdapter.addAll(it)
        }
    }


}