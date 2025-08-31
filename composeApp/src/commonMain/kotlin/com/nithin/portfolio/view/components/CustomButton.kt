package com.nithin.portfolio.view.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuRegular
import com.nithin.portfolio.utils.getDeviceTypePadding

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    onclick : (String)-> Unit,
    text : String,
    deviceType: DeviceType,
    isSelected : Boolean
){

    val borderColor = animateColorAsState(
        targetValue = if (isSelected) PrimaryAccent else Divider,
        animationSpec = tween(durationMillis = 400)
    )

    val contentColor = animateColorAsState(
        targetValue = if (isSelected) PrimaryAccent else TextPrimary,
        animationSpec = tween(durationMillis = 400)
    )

    Surface(
        modifier = modifier
            .height(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable {
                onclick.invoke(text)
            },
        border = BorderStroke(
            width = 1.dp,
            color = borderColor.value
        ),
        shape = RoundedCornerShape(12.dp),
        color = SurfaceBackGround
    ) {
        Box(
            modifier = Modifier.padding(horizontal = deviceType.getDeviceTypePadding()),
            contentAlignment = Alignment.Center
        ){

            ResponsiveText(
                title = text,
                font = UbuntuRegular(),
                deviceType = deviceType,
                textColor = contentColor.value,
                textType = TextType.BUTTON,
            )

        }
    }

}