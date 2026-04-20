package com.meowmurmur.lab4mobile

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recommendations : Fragment(R.layout.fragment_recommendations) {
    companion object {
        const val ARG_CATEGORY_ID = "categoryId"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryId = requireArguments().getString(ARG_CATEGORY_ID).orEmpty()
        val category = CityRepository.getCategory(categoryId)
        if (category == null) {
            findNavController().popBackStack()
            return
        }

        view.findViewById<TextView>(R.id.recommendationsTitle)
            .setText(category.recommendationsTitleRes)

        val recommendationsRecyclerView =
            view.findViewById<RecyclerView>(R.id.recommendationsRecyclerView)
        recommendationsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        recommendationsRecyclerView.setHasFixedSize(true)
        recommendationsRecyclerView.adapter = RecommendationAdapter(category) { recommendation ->
            findNavController().navigate(
                R.id.action_recommendations_to_recommendationCard,
                Bundle().apply {
                    putString(RecommendationCard.ARG_CATEGORY_ID, category.id)
                    putString(RecommendationCard.ARG_RECOMMENDATION_ID, recommendation.id)
                }
            )
        }
    }
}
