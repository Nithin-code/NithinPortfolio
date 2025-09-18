package com.nithin.portfolio

import kotlinx.browser.document
import org.w3c.dom.HTMLAnchorElement

actual fun downloadFile(url: String, fileName: String) {
    val link = document.createElement("a") as HTMLAnchorElement
    link.href = url
    link.download = fileName
    link.click()
}