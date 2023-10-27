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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.AppInfo
import com.example.filozz.location.LocationService

@Composable
fun PicturePage(navController: NavController) {
    var latitude by remember {
        mutableStateOf(AppInfo.location?.latitude.toString())
    }
    var longitude by remember {
        mutableStateOf(AppInfo.location?.longitude.toString())
    }
    var locationText by remember {
        mutableStateOf("($latitude; $longitude)")
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            Intent(AppInfo.appContext, LocationService::class.java).apply {
                action = LocationService.ACTION_START
                AppInfo.appContext.startService(this)
            }
        }) {
            Text(text = "Start")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            Intent(AppInfo.appContext, LocationService::class.java).apply {
                action = LocationService.ACTION_STOP
                AppInfo.appContext.startService(this)
            }
        }) {
            Text(text = "Stop")
        }
        Text(
            text = "(" + AppInfo.location?.latitude.toString() + ";" + AppInfo.location?.longitude.toString() + ")"
        )
    }
}
