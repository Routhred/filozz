package com.example.filozz.server

fun sendRequest(request: String): String {
    println(request)
    return "Done"
}

fun loginRequest(name: String, password: String): String {
    return sendRequest(SERVER_ADDRESS + "name=$name&password=$password")
}

fun registerRequest(name: String, password: String): String {
    return sendRequest(SERVER_ADDRESS + "name=$name&password=$password")
}
