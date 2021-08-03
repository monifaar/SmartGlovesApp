package com.garda.smartglovesapp1.login.db

import android.content.ContentValues
import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase

class LoginHelper(context: Context) {

    private var dataBaseHelper: DatabaseHelper = DatabaseHelper(context)

    fun checkEmailPass(email:String, password:String):Boolean {
        val db = dataBaseHelper.writableDatabase
        val query = "select * from DatabaseContract.FeedLogin.TABLE_NAME where email = $email and password = $password"
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

//    fun checkEmail(email:String):Boolean {
//        val db = dataBaseHelper.writableDatabase
//        val cursor = db.rawQuery("SELECT * FROM" + DatabaseContract.FeedLogin.TABLE_NAME + "WHERE" + DatabaseContract.FeedLogin.COLUMN_NAME_EMAIL + "='" + email + "'", null)
//        if (cursor.count>0) {
//            return true
//        }
//        else {
//            return false
//        }
//    }


