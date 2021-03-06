package com.garda.smartglovesapp1.login.db

import android.content.Context

class LoginHelper(context: Context){

    private var dataBaseHelper: DatabaseHelper = DatabaseHelper(context)

    fun checkEmailPass(email:String, password:String):Boolean {


        val db = dataBaseHelper.readableDatabase
        val query:String = "select * from login where email = ? and password = ?"
        var argSelection = arrayOf(email, password)
        val cursor = db.rawQuery(query, argSelection)
        if (cursor.count<=0) {
            cursor.close()
            return false
        }
        else {
            cursor.close()
            return true
        }
    }
}



