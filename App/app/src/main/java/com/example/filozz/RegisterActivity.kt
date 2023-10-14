package com.example.filozz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.filozz.models.GeneralResponse
import java.nio.charset.Charset
import com.example.filozz.utils.Utility
import com.google.gson.Gson
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class RegisterActivity : AppCompatActivity() {

    private lateinit var pseudo : EditText
    private lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Android")
        }
    }

    fun register(){
        val queue = Volley.newRequestQueue(applicationContext)
        val url : String = Utility.API_URL + "/auth/signup"


        val request_body : String = "name="+pseudo.text + "&password" + password.text
        val string_request : StringRequest = object : StringRequest(Request.Method.POST, url, Response.Listener
        {
                response -> Log.i("Response : ", response)
            val general_response : GeneralResponse = Gson().fromJson(response, GeneralResponse::class.java)
            Utility.showAlert(this, "Register", general_response.message)
        }, Response.ErrorListener
        {
                error -> Log.i("Error : ", error.message.toString())
        })
        {
            override fun getBody() : ByteArray{
                return request_body.toByteArray(Charset.defaultCharset())
            }
        }
        queue.add(string_request)
    }

    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard("Android")
    }
}