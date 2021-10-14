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
import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.ui.adapters.FeedListAdapter


class PostServiceDetailFragment : Fragment() {
    lateinit var post: Post
    val args: PostServiceDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_service_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val serviceImage = view.findViewById<ImageView>(R.id.serviceImageDetail)
        val serviceOwnerNameText = view.findViewById<TextView>(R.id.serviceOwnerNameDetail)
        val serviceDescriptionText = view.findViewById<TextView>(R.id.serviceNameDetail)

        post = args.post
        Glide.with(view)
            .load(post.imageUrl)
            .transform(RoundedCorners(14))
            .into(serviceImage)
        serviceOwnerNameText.text = post.ownerName
        serviceDescriptionText.text = post.publisher
    }
}