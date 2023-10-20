package com.example.filozz.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ParameterPage(navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        repeat(100) {
            Text("Item $it", modifier = Modifier.padding(2.dp))
        }
    }
}
