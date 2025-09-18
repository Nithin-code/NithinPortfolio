package com.nithin.portfolio.model

import com.nithin.portfolio.utils.Constants

data class HomeData(
    val aboutMe : String = Constants.aboutMeText,
    val dateOfJoining : String = "",
    val experience : String = Constants.EXPERIENCE + Constants.IND_EXPERIENCE,
    val skills : List<String> = Constants.skillsList,
    val title : String = "HI, I'm Nithin",
    val subTitle : String = "Android Developer | Kotlin | Jetpack Compose | KMP",
)