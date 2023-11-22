package com.example.filozz.camera

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class CameraViewModel : ViewModel() {
    private var _bitmap: Bitmap? = null
    lateinit var navController: NavController

    fun onTakePhoto(bitmap: Bitmap) {
        _bitmap = bitmap
        navController.navigate("photo_screen")
    }

    fun getBitmap(): Bitmap? {
        return _bitmap
    }
}
