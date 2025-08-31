package com.nithin.portfolio.utils

sealed interface DeviceType {

    data object Mobile : DeviceType

    data object Desktop : DeviceType

    data object Tab : DeviceType

}