package com.nithin.portfolio.view.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuMedium
import com.nithin.portfolio.utils.UbuntuRegular
import com.nithin.portfolio.utils.getBodySize
import com.nithin.portfolio.utils.getButtonTextSize
import com.nithin.portfolio.utils.getHeadingSize

@Composable
fun ResponsiveText(
    modifier: Modifier = Modifier,
    title : String = "",
    font : FontFamily = UbuntuMedium(),
    deviceType: DeviceType,
    textColor : Color = TextPrimary,
    textType: TextType
){

    val fontSize = when(textType){
        TextType.HEADING -> {
            getHeadingSize(deviceType)
        }
        TextType.BUTTON -> {
            getButtonTextSize(deviceType)
        }
        TextType.BODY -> {
            getBodySize(deviceType)
        }
    }


    Text(
        modifier = modifier,
        text = title,
        fontFamily = font,
        fontSize = fontSize,
        color = textColor
    )

}

@Composable
fun ResponsiveBodyText(
    modifier: Modifier = Modifier,
    bodyText : String = "",
    font : FontFamily = UbuntuRegular(),
    deviceType: DeviceType,
    textColor : Color = TextPrimary,
    maxLines : Int = 2
){

    val targetValue = when(deviceType){
        DeviceType.Desktop -> 20f
        DeviceType.Mobile -> 14f
        DeviceType.Tab -> 16f
    }

    val fontSize = animateFloatAsState(
        targetValue =  targetValue,
        animationSpec = tween(durationMillis = 500),
        label = ""
    )


    Text(
        modifier = modifier,
        text = bodyText,
        fontFamily = font,
        fontSize = fontSize.value.sp,
        color = textColor,
        maxLines = maxLines
    )

}