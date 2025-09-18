package com.nithin.portfolio

import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSUserDomainMask

import platform.Foundation.NSURL
import platform.Foundation.NSURLSession
import platform.Foundation.NSFileManager
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSUserDomainMask
import platform.Foundation.NSURLRequest


actual fun downloadFile(url: String, fileName: String) {
    val nsUrl = NSURL.URLWithString(url) ?: return

    val request = NSURLRequest.requestWithURL(nsUrl)
    val session = NSURLSession.sharedSession

//    val task = session.downloadTaskWithRequest(request) { location, response, error ->
//        if (location != null) {
//            // Save to Documents directory
//            val fileManager = NSFileManager.defaultManager
//            val documentsUrl = fileManager.URLsForDirectory(
//                directory = NSDocumentDirectory,
//                inDomains = NSUserDomainMask
//            ).firstObject as? NSURL
//
//            val destinationUrl = documentsUrl.URLByAppendingPathComponent(fileName)
//
//            if (destinationUrl != null) {
//                try {
//                    // Remove old file if exists
//                    fileManager.removeItemAtURL(destinationUrl, null)
//                } catch (_: Throwable) { }
//
//                try {
//                    fileManager.moveItemAtURL(location, destinationUrl, null)
//                    println("✅ File downloaded to: $destinationUrl")
//                } catch (e: Throwable) {
//                    println("❌ Failed to move file: $e")
//                }
//            }
//        } else if (error != null) {
//            println("❌ Download failed: $error")
//        }
//    }
//
//    task.resume()
}