package edu.upb.coderangersandroid.ui.mainpage.tabs.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.databinding.FragmentStoreItemDetailsBinding
import edu.upb.coderangersandroid.model.Product

class StoreItemDetailsFragment: Fragment() {
    private lateinit var binding: FragmentStoreItemDetailsBinding
    lateinit var product: Product
    val args: StoreItemDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreItemDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        product = args.product
        Glide.with(view)
            .load(product.imageUrl)
            .transform(RoundedCorners(14))
            .into(binding.imProduct)
        binding.tvProductName.text = product.name
        binding.tvProductPrice.text = product.price.toString()
        binding.tvProductDescription.text = product.description

        binding.ivBackArrow.setOnClickListener{
            findNavController().popBackStack()
        }
    }
}