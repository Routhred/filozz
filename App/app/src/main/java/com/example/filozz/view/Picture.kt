package com.example.filozz.view

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.AppInfo
import com.example.filozz.location.LocationService
import com.example.filozz.location.Map

@Composable
fun PicturePage(ctx: Context, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            Intent(ctx, LocationService::class.java).apply {
                action = LocationService.ACTION_START
                ctx.startService(this)
            }
        }) {
            Text(text = "Start")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Intent(ctx, LocationService::class.java).apply {
                action = LocationService.ACTION_STOP
                ctx.startService(this)
            }
        }) {
            Text(text = "Stop")
        }
        Map(location = AppInfo.location)
    }
}
