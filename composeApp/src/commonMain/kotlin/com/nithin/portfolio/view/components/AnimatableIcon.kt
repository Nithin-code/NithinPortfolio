package com.nithin.portfolio.view.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.utils.PrimaryAccent
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun AnimatableIcon(
    icon : DrawableResource,
    isSelected : Boolean = false,
    onIconClicked : (Boolean) -> Unit
){

    var isIconSelected by remember {
        mutableStateOf(isSelected)
    }

    val iconAngle = animateFloatAsState(
        targetValue = if (isIconSelected) 180f else 0f,
        animationSpec = tween(durationMillis = 500)
    )

    Icon(
        modifier = Modifier
            .size(24.dp)
            .rotate(iconAngle.value)
            .clickable{
                isIconSelected = !isIconSelected
                onIconClicked.invoke(isIconSelected)
            },
        painter = painterResource(icon),
        contentDescription = "drop down icon",
        tint = PrimaryAccent
    )

}