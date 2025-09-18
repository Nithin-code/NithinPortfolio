package com.nithin.portfolio

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.compose.ui.text.LinkAnnotation
import androidx.core.net.toUri

actual fun downloadFile(url: String, fileName: String) {
    val context = AppContext.context
    val request = DownloadManager.Request(
        url.toUri()
    ).setTitle(fileName)
        .setDescription("Downloading..")
        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
        .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
    val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
    downloadManager.enqueue(request)

}