package com.nithin.portfolio.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nithinportfolio.composeapp.generated.resources.Res
import nithinportfolio.composeapp.generated.resources.ubuntu_medium
import nithinportfolio.composeapp.generated.resources.ubuntu_regular

enum class TextType{
    HEADING,
    BUTTON,
    BODY
}

@Composable
fun UbuntuRegular()  = FontFamily(org.jetbrains.compose.resources.Font(Res.font.ubuntu_regular))


@Composable
fun UbuntuMedium() = FontFamily(org.jetbrains.compose.resources.Font(Res.font.ubuntu_medium))


fun getHeadingSize(deviceType: DeviceType) = when(deviceType){
    DeviceType.Desktop -> 28.sp
    DeviceType.Mobile -> 20.sp
    DeviceType.Tab -> 24.sp
}


fun getButtonTextSize(deviceType: DeviceType) = when(deviceType){
    DeviceType.Desktop -> 18.sp
    DeviceType.Mobile -> 14.sp
    DeviceType.Tab -> 16.sp
}

fun getBodySize(deviceType: DeviceType) = when(deviceType){
    DeviceType.Desktop -> 18.sp
    DeviceType.Mobile -> 14.sp
    DeviceType.Tab -> 16.sp
}


fun Dp.getDeviceType() : DeviceType{
    return if (this<600.dp) DeviceType.Mobile
    else if (this<1024.dp) DeviceType.Tab
    else DeviceType.Desktop
}

fun DeviceType.getDeviceTypePadding() : Dp{
    return if (this == DeviceType.Mobile) 16.dp
    else if (this == DeviceType.Tab) 32.dp
    else 64.dp
}

fun DeviceType.getArrangementSpace() : Dp{
    return if (this == DeviceType.Mobile) 24.dp
    else if (this == DeviceType.Desktop) 32.dp
    else 48.dp
}