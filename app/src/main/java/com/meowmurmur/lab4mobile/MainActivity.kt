package com.meowmurmur.lab4mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setSupportActionBar(toolbar)

        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.navHostFragment
        ) as NavHostFragment
        navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.categories_graph, R.id.about, R.id.settings),
            drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navigationView.setupWithNavController(navController)
        bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, arguments ->
            toolbar.title = resolveToolbarTitle(destination.id, arguments)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun resolveToolbarTitle(destinationId: Int, arguments: Bundle?): String {
        return when (destinationId) {
            R.id.categories -> getString(R.string.categories_screen_title)
            R.id.about -> getString(R.string.about_screen_title)
            R.id.settings -> getString(R.string.settings_screen_title)

            R.id.recommendations -> {
                val categoryId = arguments?.getString(Recommendations.ARG_CATEGORY_ID)
                val category = categoryId?.let(CityRepository::getCategory)
                category?.let { getString(it.recommendationsTitleRes) } ?: getString(R.string.app_name)
            }

            R.id.recommendationCard -> {
                val categoryId = arguments?.getString(RecommendationCard.ARG_CATEGORY_ID)
                val recommendationId = arguments?.getString(RecommendationCard.ARG_RECOMMENDATION_ID)
                val recommendation = if (categoryId != null && recommendationId != null) {
                    CityRepository.getRecommendation(categoryId, recommendationId)
                } else {
                    null
                }

                recommendation?.let { getString(it.titleRes) } ?: getString(R.string.app_name)
            }

            else -> getString(R.string.app_name)
        }
    }
}
