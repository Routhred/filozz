package com.example.filozz

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.app.ActivityCompat
import com.example.filozz.ext.hasRequiredPermission
import com.example.filozz.ui.theme.FilozzTheme

class MainActivity : ComponentActivity() {
    companion object {
        val CAMERAX_PERMISSIONS = arrayOf(
            Manifest.permission.CAMERA
        )
        val LOCATION_PERMISSIONS = arrayOf(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )

        val PERMISSIONS = arrayOf(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!this.hasRequiredPermission()) {
            // ActivityCompat.requestPermissions(this, MainActivity.LOCATION_PERMISSIONS, 0)
            ActivityCompat.requestPermissions(this, MainActivity.PERMISSIONS, 0)
        }

        setContent {
            FilozzTheme {
                NavigationGraph(this)
            }
        }
    }
}
