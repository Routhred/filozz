package com.example.filozz

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.filozz.view.*

@Composable
fun NavigationGraph(ctx: Context) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "auth") {
        navigation(
            startDestination = "login_screen",
            route = "auth"
        ) {
            composable(route = Screen.LoginScreen.route) {
                LoginPage(navController = navController)
            }
            composable(route = Screen.RegisterScreen.route) {
                RegisterPage(navController = navController)
            }
        }
        navigation(
            startDestination = "home_screen",
            route = "main"
        ) {
            composable(route = Screen.HomeScreen.route) {
                HomePage(navController = navController)
            }
            composable(route = Screen.HumorScreen.route) {
                HumorPage(navController = navController)
            }
            composable(route = Screen.ParameterScreen.route) {
                ParameterPage(navController = navController)
            }
            composable(route = Screen.PictureScreen.route) {
                PicturePage(ctx, navController = navController)
            }
        }
    }
}
