package edu.upb.coderangersandroid.ui.adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.model.Post


class FeedListAdapter : RecyclerView.Adapter<FeedListAdapter.FeedListViewHolder>() {
    var elementList: MutableList<Post> = mutableListOf()

    fun addAll( newElementList: MutableList<Post> ){
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_feed, parent, false)
        return FeedListViewHolder(view)
    }

    override fun onBindViewHolder(holder: FeedListViewHolder, position: Int) {
        holder.bind(elementList[position])
    }

    override fun getItemCount(): Int {
        return elementList.size
    }

    class FeedListViewHolder( val itemView: View ): RecyclerView.ViewHolder(itemView){
        private val serviceImage = itemView.findViewById<ImageView>(R.id.serviceImage)
        private val serviceNameText = itemView.findViewById<TextView>(R.id.serviceNameText)
        private val serviceDescriptionText = itemView.findViewById<TextView>(R.id.serviceDescriptionText)
        fun bind(post: Post){
            serviceNameText.text = post.publisher
            serviceDescriptionText.text = post.publisher
        }
    }

}