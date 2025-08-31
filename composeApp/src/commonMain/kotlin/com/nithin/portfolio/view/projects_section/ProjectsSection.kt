package com.nithin.portfolio.view.projects_section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.model.HomeData
import com.nithin.portfolio.model.ProjectData
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.view.components.ResponsiveText

@Composable
fun ProjectSection(
    homeData: HomeData,
    modifier: Modifier = Modifier,
    title : String = "",
    deviceType : DeviceType
){

    Surface(
        shape = RoundedCornerShape(16.dp),
        border = _root_ide_package_.androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = Divider
        ),
        color = SurfaceBackGround
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            ResponsiveText(
                modifier = Modifier,
                title = title,
                deviceType = deviceType,
                textType = TextType.HEADING
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                val itemsSize = ProjectData.entries.size

                ProjectData.entries.forEach { projectData ->

                    ProjectDetails(
                        modifier = Modifier.weight(1f/itemsSize),
                        deviceType = deviceType,
                        icon = projectData.icon,
                        projectTitle = projectData.projectName,
                        projectSubTitle =  projectData.techUsed,
                    )

                }

            }

        }
    }

}