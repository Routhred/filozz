package com.example.filozz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.filozz.models.GeneralResponse
import java.nio.charset.Charset
import com.example.filozz.utils.Utility
import com.google.gson.Gson


class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var pseudo = findViewById<EditText>(R.id.editTextPseudo)
        var password = findViewById<EditText>(R.id.editTextPassword)

        findViewById<Button>(R.id.register).setOnClickListener{
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
    }
}