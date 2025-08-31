package com.nithin.portfolio.view.projects_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.view.components.AutoScrollableText
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProjectDetails(
    deviceType: DeviceType,
    modifier: Modifier = Modifier,
    projectTitle : String,
    projectSubTitle : String,
    icon : DrawableResource
){


    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        border = _root_ide_package_.androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = Divider
        ),
        color = SurfaceBackGround
    ){

        Column(
            modifier = Modifier
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Icon(
                modifier = Modifier
                    .width(50.dp)
                    .height(32.dp),
                painter = painterResource(icon),
                contentDescription = "project image",
                tint = PrimaryAccent
            )

            AutoScrollableText(
                text = projectTitle,
                deviceType = deviceType,
                textType = TextType.HEADING
            )

            AutoScrollableText(
                text = projectSubTitle,
                deviceType = deviceType,
                textType = TextType.BODY
            )

        }

    }


}