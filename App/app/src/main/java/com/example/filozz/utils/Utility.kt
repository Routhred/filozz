package com.example.filozz.utils

import android.content.Context
import androidx.appcompat.app.AlertDialog

object Utility {

    val API_URL: String = "http://192.168.1.11:3000"

    fun showAlert(context: Context, title : String = "", message : String = "", on_yes : Runnable?
    = null, on_no : Runnable? = null){
        val alert_dialog_builder = AlertDialog.Builder(context)
        alert_dialog_builder.setTitle(title)
        alert_dialog_builder.setMessage(message)
        alert_dialog_builder.setPositiveButton(android.R.string.yes){
                dialog, which -> on_yes?.run()
        }
        alert_dialog_builder.setNegativeButton(android.R.string.no){
                dialog, which -> on_no?.run()
        }
        alert_dialog_builder.show()
    }
}