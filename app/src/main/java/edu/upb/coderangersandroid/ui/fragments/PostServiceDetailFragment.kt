package edu.upb.coderangersandroid.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.databinding.FragmentServiceDetailsBinding
import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.ui.adapters.FeedListAdapter


class PostServiceDetailFragment : Fragment() {
    private lateinit var binding: FragmentServiceDetailsBinding
    lateinit var post: Post
    val args: PostServiceDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServiceDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        post = args.post
        Glide.with(view)
            .load(post.imageUrl)
            .transform(RoundedCorners(14))
            .into(binding.serviceImageDetail)
        binding.serviceOwnerNameDetail.text = post.ownerName
        binding.serviceNameDetail.text = post.publisher
    }
}