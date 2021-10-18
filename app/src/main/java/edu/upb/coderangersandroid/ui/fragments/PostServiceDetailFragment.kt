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
import com.bumptech.glide.request.RequestOptions
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
        val serviceOwnerNameText = view.findViewById<TextView>(R.id.serviceOwnerNameDetail)
        val serviceNameDetailText = view.findViewById<TextView>(R.id.serviceNameDetail)
        val description = view.findViewById<TextView>(R.id.tvDescription)
        val phoneNumberDetail = view.findViewById<TextView>(R.id.PhoneNumberDetail)
        val serviceBackButton = view.findViewById<ImageView>(R.id.backButton)

        post = arguments?.getSerializable("post") as Post?

        post?.let {
            Glide.with(view)
                .load(it.imageUrl)
                .transform(RoundedCorners(14))
                .into(serviceImage)
            serviceOwnerNameText.text = it.ownerName
            serviceNameDetailText.text = it.publisher
            description.text = it.shortDescription
            phoneNumberDetail.text = it.phone.toString()
        }

        serviceBackButton.setOnClickListener{
            parentFragmentManager.popBackStack()
        }
    }
}