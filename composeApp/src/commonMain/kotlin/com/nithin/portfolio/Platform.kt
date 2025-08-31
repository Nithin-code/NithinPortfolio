package com.nithin.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform