package com.example.filozz

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.filozz.view.*

@Composable
fun navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.LoginScreen.route) {
            LoginPage(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route) {
            RegisterPage(navController = navController)
        }
        composable(route = Screen.HomeScreen.route) {
            HomePage(navController = navController)
        }
        composable(route = Screen.HumorScreen.route) {
            HomePage(navController = navController)
        }
    }
}
