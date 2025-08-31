package com.nithin.portfolio.view.components

import androidx.compose.animation.core.tween
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.TextPrimary
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuRegular
import com.nithin.portfolio.utils.getBodySize
import com.nithin.portfolio.utils.getButtonTextSize
import com.nithin.portfolio.utils.getHeadingSize

@Composable
fun AutoScrollableText(
    modifier: Modifier = Modifier,
    text : String,
    deviceType: DeviceType,
    textType: TextType,
    color : Color = TextPrimary
) {

    val fontSize = when(textType){
        TextType.HEADING -> getHeadingSize(deviceType)
        TextType.BUTTON -> getButtonTextSize(deviceType)
        TextType.BODY -> getBodySize(deviceType)
    }

    val scrollState = rememberScrollState()

    var isEndReached by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(isEndReached){
        scrollState.animateScrollTo(scrollState.maxValue , animationSpec = tween(durationMillis = 800 , delayMillis = 1000))
        isEndReached = true
        scrollState.animateScrollTo(0, animationSpec = tween(durationMillis = 800))
        isEndReached = false
    }


    Text(
        text = text,
        modifier = modifier.horizontalScroll(scrollState),
        fontFamily = UbuntuRegular(),
        maxLines = 1,
        fontSize = fontSize,
        color = color
    )

}