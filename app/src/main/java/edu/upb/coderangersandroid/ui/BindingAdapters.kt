package edu.upb.coderangersandroid.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("srcUrl")
fun setImageSrcUrl(imageView: ImageView, url: String?) {
    if(url == null) return
    Glide.with(imageView)
        .load(url)
        .into(imageView)
}