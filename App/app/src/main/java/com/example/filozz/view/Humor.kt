package com.example.filozz.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.AppInfo
import com.example.filozz.Humor
import com.example.filozz.Screen
import com.example.filozz.rememberInfoScreen
import com.example.filozz.ui.theme.Grey

@Composable
fun HumorPage(navController: NavController) {
    val screen = rememberInfoScreen()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            screen.getDpHeight(),
            Alignment.Top
        ),
        modifier = Modifier
            .background(Grey)
            .fillMaxSize()
    ) {
        Box(
            modifier = androidx.compose.ui.Modifier
                .width(screen.getDpWidth(4))
                .height(screen.getDpHeight(4))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 15.dp)
                )
                .clickable {
                    AppInfo.humor = Humor.HAPPY.num
                    navController.navigate(
                        Screen.HomeScreen.route
                    )
                }

        ) {
            Image(
                painter = painterResource(id = Humor.HAPPY.num),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(size = 15.dp))
            )
        }
        Box(
            modifier = Modifier
                .width(screen.getDpWidth(4))
                .height(screen.getDpHeight(4))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 15.dp)
                )
                .clickable {
                    AppInfo.humor = Humor.SAD.num
                    navController.navigate(
                        Screen.HomeScreen.route
                    )
                }

        ) {
            Image(
                painter = painterResource(id = Humor.SAD.num),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(size = 15.dp))
            )
        }
        Box(
            modifier = Modifier
                .width(screen.getDpWidth(4))
                .height(screen.getDpHeight(4))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 15.dp)
                )
                .clickable {
                    AppInfo.humor = Humor.ALONE.num
                    navController.navigate(
                        Screen.HomeScreen.route
                    )
                }

        ) {
            Image(
                painter = painterResource(id = Humor.ALONE.num),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(size = 15.dp))
            )
        }
        Box(
            modifier = Modifier
                .width(screen.getDpWidth(4))
                .height(screen.getDpHeight(4))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 15.dp)
                )
                .clickable {
                    AppInfo.humor = Humor.EXCITED.num
                    navController.navigate(
                        Screen.HomeScreen.route
                    )
                }

        ) {
            Image(
                painter = painterResource(id = Humor.EXCITED.num),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(size = 15.dp))
            )
        }
    }
}
