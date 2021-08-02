package com.garda.smartglovesapp1.login.db

import android.content.ContentValues
import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase

class LoginHelper(context: Context) {

    private var dataBaseHelper: DatabaseHelper = DatabaseHelper(context)
    private lateinit var database: SQLiteDatabase

//    @Throws(SQLException::class)
    fun insertUser(loginModel: LoginModel): Boolean {
        val result = true
        try {
            val db = dataBaseHelper.writableDatabase
            val values = ContentValues()
            values.put(DatabaseContract.FeedLogin.COLUMN_NAME_EMAIL, loginModel.email)
            values.put(DatabaseContract.FeedLogin.COLUMN_NAME_PASSWORD, loginModel.password)

            val newRowId = db.insert(DatabaseContract.FeedLogin.TABLE_NAME, null, values)
        }
        catch (e:Exception) {
            return false
        }
        return result
    }

    fun checkEmail(email:String):Boolean {
        val db = dataBaseHelper.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM" + DatabaseContract.FeedLogin.TABLE_NAME + "WHERE" + DatabaseContract.FeedLogin.COLUMN_NAME_EMAIL + email, null)
        if (cursor.count>0) {
            return true
        }
        else {
            return false
        }
    }

}
