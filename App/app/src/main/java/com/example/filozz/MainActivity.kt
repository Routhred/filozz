package com.example.filozz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import java.util.Timer
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams
            .FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        Timer().schedule(3000){
            startActivity(Intent(applicationContext, RegisterActivity::class.java))
            finish()
        }
    }
}