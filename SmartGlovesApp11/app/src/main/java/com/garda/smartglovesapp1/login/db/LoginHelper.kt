package com.garda.smartglovesapp1.login.db

import android.content.Context

class LoginHelper(context: Context) {

    private var dataBaseHelper: DatabaseHelper = DatabaseHelper(context)

    fun checkEmailPass(email:String, password:String):Boolean {
        val db = dataBaseHelper.writableDatabase
        val query = "select * from id where email = $email and password = $password"
        val cursor = db.rawQuery(query,null)
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



