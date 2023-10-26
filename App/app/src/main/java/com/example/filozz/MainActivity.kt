package com.example.filozz

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.filozz.server.*
import com.example.filozz.server.Connection
import com.example.filozz.ui.theme.TestTheme

class MainActivity : ComponentActivity() {

    companion object {
        lateinit var appContext: Context
        lateinit var connector: Connection
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appContext = this
        connector = Connection(this, SERVER_IP, SERVER_PORT, SERVER_PROTOCOL)
        setContent {
            TestTheme {
                navigation()
            }
        }
    }
}
