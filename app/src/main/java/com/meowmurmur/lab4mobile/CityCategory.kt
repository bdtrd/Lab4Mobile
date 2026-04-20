package com.meowmurmur.lab4mobile

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CityCategory(
    val id: String,
    @param:StringRes @field:StringRes val nameRes: Int,
    @param:StringRes @field:StringRes val subtitleRes: Int,
    @param:StringRes @field:StringRes val recommendationsTitleRes: Int,
    @param:DrawableRes @field:DrawableRes val illustrationRes: Int,
    val recommendations: List<Recommendation>
)
