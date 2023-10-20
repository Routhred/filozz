package com.example.filozz

class AppInfo {

    companion object {
        var humor: Int = Humor.HAPPY.num
    }
}
enum class Humor(val num: Int) {
    HAPPY(R.drawable.happy),
    SAD(R.drawable.sad),
    ALONE(R.drawable.alone),
    EXCITED(R.drawable.exited)
}
