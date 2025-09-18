package com.nithin.portfolio.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nithin.portfolio.model.HomeData
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.getArrangementSpace
import com.nithin.portfolio.utils.getDeviceTypePadding
import com.nithin.portfolio.view.about_me.AboutMeSection
import com.nithin.portfolio.view.experience.ExperienceSection
import com.nithin.portfolio.view.projects_section.ProjectSection
import com.nithin.portfolio.view.skills.SkillsSession

@Composable
fun ResponsiveLayout(
    homeData: HomeData,
    deviceType: DeviceType
){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(SurfaceBackGround)
            .padding(deviceType.getDeviceTypePadding()),
        verticalArrangement = Arrangement.spacedBy(
            deviceType.getArrangementSpace()
        )
    ){

        item {
            Header(
                modifier = Modifier
                    .fillMaxWidth(),
                deviceType = deviceType,
                title = homeData.title,
                subTitle = homeData.subTitle
            )
        }


        item {
            AboutMeSection(
                deviceType = deviceType,
                title = "About Me"
            )
        }

        item {
            ProjectSection(
                title = "Projects",
                deviceType = deviceType,
                homeData = homeData
            )
        }

        item {
            ExperienceSection(
                homeData = homeData,
                title = "Experience",
                deviceType = deviceType
            )
        }


        item {
            SkillsSession(
                homeData = homeData,
                title = "Skills",
                deviceType = deviceType,
            )
        }

    }

}