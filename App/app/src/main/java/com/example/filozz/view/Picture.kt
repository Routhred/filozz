package com.example.filozz.view

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.MainActivity
import com.example.filozz.location.LocationService

@Composable
fun PicturePage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            Intent(MainActivity.appContext, LocationService::class.java).apply {
                action = LocationService.ACTION_START
                MainActivity.appContext.startService(this)
            }
        }) {
            Text(text = "Start")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Intent(MainActivity.appContext, LocationService::class.java).apply {
                action = LocationService.ACTION_STOP
                MainActivity.appContext.startService(this)
            }
        }) {
            Text(text = "Stop")
        }
    }
}
