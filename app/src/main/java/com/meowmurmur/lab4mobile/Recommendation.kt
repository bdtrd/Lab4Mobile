package com.meowmurmur.lab4mobile

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation(
    val id: String,
    @param:StringRes @field:StringRes val titleRes: Int,
    @param:StringRes @field:StringRes val summaryRes: Int,
    @param:StringRes @field:StringRes val descriptionRes: Int,
    @param:DrawableRes @field:DrawableRes val illustrationRes: Int
)
