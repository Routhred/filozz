package com.example.filozz

import android.location.Location

class AppInfo {
    companion object {
        var humor: Int = Humor.HAPPY.num
        lateinit var location: Location
    }
}
enum class Humor(val num: Int) {
    HAPPY(R.drawable.happy),
    SAD(R.drawable.sad),
    ALONE(R.drawable.alone),
    EXCITED(R.drawable.exited)
}
