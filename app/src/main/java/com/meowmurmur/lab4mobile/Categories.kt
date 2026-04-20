package com.meowmurmur.lab4mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Categories : Fragment(R.layout.fragment_categories) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesRecyclerView = view.findViewById<RecyclerView>(R.id.categoriesRecyclerView)
        categoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        categoriesRecyclerView.setHasFixedSize(true)
        categoriesRecyclerView.adapter = CategoryAdapter(CityRepository.getCategories()) { category ->
            findNavController().navigate(
                R.id.action_categories_to_recommendations,
                Bundle().apply {
                    putString(Recommendations.ARG_CATEGORY_ID, category.id)
                }
            )
        }
    }
}
