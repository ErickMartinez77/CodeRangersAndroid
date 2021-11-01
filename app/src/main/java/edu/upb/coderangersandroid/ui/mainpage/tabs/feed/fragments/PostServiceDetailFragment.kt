package edu.upb.coderangersandroid.ui.mainpage.tabs.feed.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.databinding.FragmentServiceDetailsBinding
import edu.upb.coderangersandroid.model.Favorite
import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.ui.mainpage.tabs.feed.PostDetailsViewModel
import java.util.*


class PostServiceDetailFragment : Fragment() {
    private lateinit var binding: FragmentServiceDetailsBinding
    lateinit var post: Post
    val args: PostServiceDetailFragmentArgs by navArgs()
    private val postDetailsViewModel:PostDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServiceDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btFavorite = binding.btFavorite
        val text = binding.textView
        var favorite: Favorite? = null
        var isFavorite = false

        post = args.post
        Glide.with(view)
            .load(post.imageUrl)
            .transform(RoundedCorners(14))
            .into(binding.serviceImageDetail)
        binding.serviceOwnerNameDetail.text = post.ownerName
        binding.serviceNameDetail.text = post.publisher
        binding.tvDescription.text = post.shortDescription
        binding.PhoneNumberDetail.text = post.phone.toString()

        binding.backButton.setOnClickListener{
            findNavController().popBackStack()
        }

        postDetailsViewModel.favorite.observe(viewLifecycleOwner){
            isFavorite = it != null
            if (it !=null){
                text.text="FAVORITO"
            }else{
                text.text="No es FAVORITO"
            }
        }
        postDetailsViewModel.getFavoriteForPostId(post.id)

        btFavorite.setOnClickListener{
            if(postDetailsViewModel.favorite.value != null){
                postDetailsViewModel.deleteFavorite(postDetailsViewModel.favorite.value!!)
            }else{
                postDetailsViewModel.saveFavorite(Favorite(0, post.id,System.currentTimeMillis().toString()))
            }
        }
    }
}