package edu.upb.coderangersandroid.ui.mainpage.tabs.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.upb.coderangersandroid.databinding.ListItemFeedBinding
import edu.upb.coderangersandroid.model.Post


class FeedListAdapter : RecyclerView.Adapter<FeedListAdapter.FeedListViewHolder>() {
    private var elementList: MutableList<Post> = mutableListOf()
    private var onFeedItemClickListener: ((post: Post)-> Unit)?= null

    fun addAll( newElementList: List<Post> ){
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
            binding.post = post
        }
    }

}