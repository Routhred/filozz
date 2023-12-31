package com.example.filozz

sealed class Screen (val route : String){
    object LoginScreen : Screen("login_screen")
    object RegisterScreen : Screen("register_screen")
}
