package com.meowmurmur.lab4mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView

class RecommendationAdapter(
    private val category: CityCategory,
    private val onRecommendationClick: (Recommendation) -> Unit
) : RecyclerView.Adapter<RecommendationAdapter.RecommendationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recommendation, parent, false)
        return RecommendationViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecommendationViewHolder, position: Int) {
        holder.bind(category.recommendations[position])
    }

    override fun getItemCount(): Int = category.recommendations.size

    inner class RecommendationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val artView: ImageView = itemView.findViewById(R.id.recommendationItemArt)
        private val titleView: TextView = itemView.findViewById(R.id.recommendationItemTitle)
        private val summaryView: TextView = itemView.findViewById(R.id.recommendationItemSummary)

        fun bind(recommendation: Recommendation) {
            val context = itemView.context
            val recommendationName = context.getString(recommendation.titleRes)

            artView.setImageDrawable(
                AppCompatResources.getDrawable(context, recommendation.illustrationRes)
            )
            artView.contentDescription = context.getString(
                R.string.recommendation_art_content_description,
                recommendationName
            )
            titleView.setText(recommendation.titleRes)
            summaryView.setText(recommendation.summaryRes)
            itemView.setOnClickListener { onRecommendationClick(recommendation) }
        }
    }
}
