package kr.co.fastcampus.co.kr.coroutines.ui.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.co.fastcampus.co.kr.coroutines.model.Item

class FavouritesAdapter(    private val like: (Item) -> Unit) : RecyclerView.Adapter<ImageSearchViewHolder>() {

    private var items: List<Item> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSearchViewHolder {
        return ImageSearchViewHolder.create(like, parent)
    }

    override fun onBindViewHolder(holder: ImageSearchViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount() = items.size

    fun setItems(items: List<Item>) {
        this.items = items
        notifyDataSetChanged()
    }
}
