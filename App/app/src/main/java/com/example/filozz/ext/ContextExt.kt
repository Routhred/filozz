package com.example.filozz.ext

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import com.example.filozz.MainActivity

fun Context.hasRequiredPermission(): Boolean {
    return MainActivity.PERMISSIONS.all { it ->
        ContextCompat.checkSelfPermission(
            this,
            it
        ) == PackageManager.PERMISSION_GRANTED
    }
}
