package edu.upb.coderangersandroid.ui.mainpage.tabs.store

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import edu.upb.coderangersandroid.databinding.ListItemStoreBinding
import edu.upb.coderangersandroid.model.Product

class StoreListAdapter: RecyclerView.Adapter<StoreListAdapter.StoreListViewHolder>() {

    private var elementList: MutableList<Product> = mutableListOf()

    fun addAll(newElementList: MutableList<Product>){
        elementList.clear()
        elementList.addAll(newElementList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreListViewHolder {
        val binding = ListItemStoreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoreListViewHolder, position: Int) {
        holder.bind(elementList[position])
        holder.binding.root.setOnClickListener{

        }
    }

    override fun getItemCount(): Int {
        return elementList.size
    }

    class StoreListViewHolder(val binding: ListItemStoreBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(product:Product){
            Glide.with(itemView)
                .load(product.imageUrl)
                .transform(RoundedCorners(14))
                .into(binding.ivImage)
            binding.tvName.text = product.name
            binding.tvPrice.text = product.price.toString() + "Bs"
        }
    }
}