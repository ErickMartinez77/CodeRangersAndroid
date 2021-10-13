package edu.upb.coderangersandroid.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.ui.adapters.FeedListAdapter


class PostServiceDetailFragment : Fragment() {
    var post: Post? = null
    private val feedListAdapter = FeedListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_service_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val serviceImage = view.findViewById<ImageView>(R.id.serviceImageDetail)
        val serviceNameText = view.findViewById<TextView>(R.id.serviceOwnerNameDetail)
        val serviceDescriptionText = view.findViewById<TextView>(R.id.serviceOwnerNameDetail)

        post = arguments?.getSerializable("post") as Post?

        post?.let {
            Glide.with(view)
                .load(it.imageUrl)
                .transform(RoundedCorners(14))
                .into(serviceImage)
            serviceNameText.text = it.publisher
            serviceDescriptionText.text = it.shortDescription
        }

    }
}