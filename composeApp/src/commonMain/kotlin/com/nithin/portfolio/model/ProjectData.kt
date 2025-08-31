package com.nithin.portfolio.model

import nithinportfolio.composeapp.generated.resources.Res
import nithinportfolio.composeapp.generated.resources.save_money
import org.jetbrains.compose.resources.DrawableResource

enum class ProjectData(
    val icon : DrawableResource,
    val projectName : String,
    val techUsed : String,
) {

    EXPENSE_TRACKER(
        icon = Res.drawable.save_money,
        projectName = "Expense Tracker",
        techUsed = "Kotlin + Compose"
    ),

    NOTES_APP(
        icon = Res.drawable.save_money,
        projectName = "Notes App",
        techUsed = "Kotlin + MVVM"
    )



}