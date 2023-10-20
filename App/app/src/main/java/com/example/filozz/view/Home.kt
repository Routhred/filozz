package com.example.filozz.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.filozz.Screen
import com.example.filozz.ScreenInfo
import com.example.filozz.rememberInfoScreen
import com.example.filozz.ui.theme.*

@Composable
fun HomePage(navController: NavController) {
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
            .padding(vertical = screen.getDpHeight())
    ) {
        timer_widget(screen = screen)
        Row(
            horizontalArrangement = Arrangement.spacedBy(screen.getDpWidth(), Alignment.Start),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .padding(
                    horizontal = screen.getDpWidth(),
                    vertical = screen.getDpHeight()
                )
        ) {
            chat_widget(screen = screen)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    screen.getDpHeight(),
                    Alignment
                        .Top
                )

            ) {
                parameters_widget(screen = screen)
                humor_widget(screen = screen, navController = navController)
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(
                screen.getDpWidth(2),
                Alignment.Start
            ),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(
                    horizontal = screen.getDpWidth()
                )
        ) {
            trophy_widget(screen = screen)
            locket_widget(screen = screen)
        }
    }
}

@Composable
fun timer_widget(screen: ScreenInfo) {
    Box(
        modifier = Modifier
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .width(screen.getDpWidth(13))
            .height(screen.getDpHeight(7.5f))
    ) {
        Text(text = "TODO : Timer")
    }
}

@Composable
fun chat_widget(screen: ScreenInfo) {
    Box(
        modifier = Modifier
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .width(screen.getDpWidth(8))
            .height(screen.getDpHeight(10))

    ) {
        Text(text = "TODO : Chat")
    }
}

@Composable
fun parameters_widget(screen: ScreenInfo) {
    Box(
        modifier = Modifier
            .width(screen.getDpWidth(4))
            .height(screen.getDpHeight(4))
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .padding(15.dp)
    ) {
        Text(text = "TODO : Parameters")
    }
}

@Composable
fun humor_widget(screen: ScreenInfo, navController: NavController) {
    Box(
        modifier = Modifier
            .width(screen.getDpWidth(4))
            .height(screen.getDpHeight(4))
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .padding(15.dp)
            .clickable {
                navController.navigate(
                    Screen.HumorScreen.route
                )
            }

    ) {
        Text(text = "TODO : Happy")
    }
}

@Composable
fun trophy_widget(screen: ScreenInfo) {
    Box(
        modifier = Modifier
            .width(screen.getDpWidth(4))
            .height(screen.getDpHeight(5))
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .padding(15.dp)
    ) {
        Text(text = "TODO : Trophy")
    }
}

@Composable
fun locket_widget(screen: ScreenInfo) {
    Box(
        modifier = Modifier
            .width(screen.getDpWidth(7))
            .height(screen.getDpHeight(9))
            .background(
                color = Green,
                shape = RoundedCornerShape(size = 15.dp)
            )
            .padding(15.dp)
    ) {
        Text(text = "TODO : Locket")
    }
}
