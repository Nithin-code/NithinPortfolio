package com.nithin.portfolio.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuRegular
import com.nithin.portfolio.utils.getDeviceType

@Composable
fun ProgressBar(
    indicatorColor: Color = PrimaryAccent,
    backgroundColor : Color = SurfaceBackGround
){

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        val deviceType = maxWidth.getDeviceType()

        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(SurfaceBackGround),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            CircularProgressIndicator(
                modifier = Modifier
                    .size(24.dp),
                color = indicatorColor
            )

            Spacer(modifier = Modifier.width(16.dp))

            ResponsiveText(
                textType = TextType.HEADING,
                title = "Please wait...",
                deviceType = deviceType
            )

        }

    }

}