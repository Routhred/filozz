package com.example.filozz

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.filozz.view.LoginPage
import com.example.filozz.view.RegisterPage

@Composable
fun navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(route = Screen.LoginScreen.route){
            LoginPage(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route){
            RegisterPage(navController = navController)
        }
    }

}
