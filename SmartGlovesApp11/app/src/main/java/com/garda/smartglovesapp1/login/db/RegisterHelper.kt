package com.garda.smartglovesapp1.login.db

import android.content.ContentValues
import android.content.Context

class RegisterHelper(context: Context) {
    private var dataBaseHelper: DatabaseHelper = DatabaseHelper(context)

    fun insertUser(loginModel: LoginModel): Long {
        val db = dataBaseHelper.writableDatabase
        val values = ContentValues()
        values.put(DatabaseContract.FeedLogin.COLUMN_NAME_REG, loginModel.reg)
        values.put(DatabaseContract.FeedLogin.COLUMN_NAME_EMAIL, loginModel.email)
        values.put(DatabaseContract.FeedLogin.COLUMN_NAME_PASSWORD, loginModel.password)

       return db.insert(DatabaseContract.FeedLogin.TABLE_NAME, null, values)
    }
}