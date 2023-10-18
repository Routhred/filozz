package com.example.filozz.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.ui.theme.*


val PADDING= 25.dp

@Composable
fun HomePage(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp, Alignment.Top),
        modifier = Modifier
            .background(Grey)
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
        ){
            Text(text = "TODO : Timer")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .padding(PADDING)
        ){
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
            ){
                Text(text = "TODO : Chat")
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(30.dp, Alignment.Top),
                modifier = Modifier.padding(PADDING)

            ){
                Box(
                    modifier = Modifier
                    .background(Color.Green)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                ){
                    Text(text = "TODO : Parameters")
                }
                Box(
                    modifier = Modifier
                        .background(Color.Cyan)
                        .fillMaxWidth()
                        .fillMaxHeight()

                ){
                    Text(text = "TODO : Happy")
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(FractionalPadding(start = 0.1f, end = 0.1f))
        ){
            Box(
                modifier = Modifier
                    .background(Color.DarkGray)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
            ){
                Text(text = "TODO : Trophy")
            }
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ){
                Text(text = "TODO : Locket")
            }
        }

    }


}
