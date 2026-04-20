package com.meowmurmur.lab4mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    private val items: List<CityCategory>,
    private val onCategoryClick: (CityCategory) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val artView: ImageView = itemView.findViewById(R.id.categoryItemArt)
        private val titleView: TextView = itemView.findViewById(R.id.categoryItemTitle)
        private val subtitleView: TextView = itemView.findViewById(R.id.categoryItemSubtitle)
        private val countView: TextView = itemView.findViewById(R.id.categoryItemCount)

        fun bind(category: CityCategory) {
            artView.setImageDrawable(
                AppCompatResources.getDrawable(itemView.context, category.illustrationRes)
            )
            artView.contentDescription = itemView.context.getString(
                R.string.category_art_content_description,
                itemView.context.getString(category.nameRes)
            )
            titleView.setText(category.nameRes)
            subtitleView.setText(category.subtitleRes)
            countView.text = itemView.resources.getQuantityString(
                R.plurals.recommendation_count,
                category.recommendations.size,
                category.recommendations.size
            )
            itemView.setOnClickListener { onCategoryClick(category) }
        }
    }
}
