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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.filozz.MainActivity
import com.example.filozz.location.LocationService

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
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("camera_screen")
        }) {
            Text(text = "Open Camera")
        }
        // Map(location = AppInfo.location)
    }
}

@Preview
@Composable
fun previewPicture() {
    PicturePage(ctx = MainActivity(), navController = rememberNavController())
}
