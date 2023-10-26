package com.example.filozz.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.filozz.MainActivity
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationServices

lateinit var fusedLocationProviderClient: FusedLocationProviderClient
lateinit var locationCallback: LocationCallback
var locationRequired: Boolean = false

@Composable
fun PicturePage(navController: NavController) {
    var location by remember { mutableStateOf("ICI") }

    Column() {
        Text(text = location)
        Button(onClick = { location = getLocation() }) {}
    }
}

fun getLocation(): String {
    fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(MainActivity)
    if (locationRequired) {
    }
    return "La"
}
