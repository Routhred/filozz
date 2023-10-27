package com.example.filozz.location

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

class LocationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val channel = NotificationChannel(
            "location",
            "Location",
            NotificationManager.IMPORTANCE_LOW
        )
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager // ktlint-disable max-line-length
        notificationManager.createNotificationChannel(channel)
    }
}
