package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "NewsPedia",
        description = "Stay Informed, Stay Ahead: Your Daily Dose of News, Anytime, Anywhere!",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Headlines in a Hurry: Your Quick News Fix!",
        description = "Empowering Your Day, One Headline at a Time: Unleash the Power of Knowledge with Our 24/7 News Hub!",
        image = R.drawable.onboarding3
    )
)