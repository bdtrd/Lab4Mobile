package com.meowmurmur.lab4mobile

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RecommendationCard : Fragment(R.layout.fragment_recommendation_card) {
    companion object {
        const val ARG_CATEGORY_ID = "categoryId"
        const val ARG_RECOMMENDATION_ID = "recommendationId"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryId = requireArguments().getString(ARG_CATEGORY_ID).orEmpty()
        val recommendationId = requireArguments().getString(ARG_RECOMMENDATION_ID).orEmpty()
        val category = CityRepository.getCategory(categoryId)
        val recommendation = CityRepository.getRecommendation(categoryId, recommendationId)
        if (category == null || recommendation == null) {
            findNavController().popBackStack()
            return
        }

        val categoryName = getString(category.nameRes)
        val heroArtView = view.findViewById<ImageView>(R.id.detailHeroArt)
        heroArtView.setImageDrawable(
            AppCompatResources.getDrawable(requireContext(), recommendation.illustrationRes)
        )
        heroArtView.contentDescription =
            getString(R.string.recommendation_art_content_description, getString(recommendation.titleRes))
        view.findViewById<TextView>(R.id.detailHeroTitle).setText(recommendation.titleRes)
        view.findViewById<TextView>(R.id.detailTownChip).text = categoryName
        view.findViewById<TextView>(R.id.detailLead).setText(recommendation.summaryRes)
        view.findViewById<TextView>(R.id.detailDescription).setText(recommendation.descriptionRes)
    }
}
