package edu.upb.coderangersandroid.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.databinding.ListItemFeedBinding
import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.ui.interfaces.OnFeedItemClickListener


class FeedListAdapter : RecyclerView.Adapter<FeedListAdapter.FeedListViewHolder>() {
    private var elementList: MutableList<Post> = mutableListOf()
    private var onFeedItemClickListener: ((post: Post)-> Unit)?= null

    fun addAll( newElementList: MutableList<Post> ){
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    fun setOnFeedItemClickListener(onFeedItemClickListener: ((post: Post)-> Unit)){
        this.onFeedItemClickListener = onFeedItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedListViewHolder {
        val binding = ListItemFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FeedListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedListViewHolder, position: Int) {
        holder.bind(elementList[position])
        holder.binding.root.setOnClickListener{
            onFeedItemClickListener?.invoke(elementList[position])
        }
    }

    override fun getItemCount(): Int {
        return elementList.size
    }

    class FeedListViewHolder(val binding: ListItemFeedBinding ): RecyclerView.ViewHolder(binding.root){
        fun bind(post: Post){
            Glide.with(itemView)
                .load(post.imageUrl)
                .transform(RoundedCorners(14))
                .into(binding.serviceImage)
            binding.serviceNameText.text = post.publisher
            binding.serviceDescriptionText.text = post.shortDescription
        }
    }

}