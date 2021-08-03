package com.garda.smartglovesapp1.login.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.garda.smartglovesapp1.login.db.DatabaseContract.FeedLogin.TABLE_NAME


class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbloginapp"
        private const val DATABASE_VERSION = 4
        private const val SQL_CREATE_ENTRIES =
                "CREATE TABLE ${DatabaseContract.FeedLogin.TABLE_NAME} (" +
                        "${DatabaseContract.FeedLogin._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "${DatabaseContract.FeedLogin.COLUMN_NAME_REG} TEXT ," +
                        "${DatabaseContract.FeedLogin.COLUMN_NAME_EMAIL} TEXT ," +
                        "${DatabaseContract.FeedLogin.COLUMN_NAME_PASSWORD} TEXT )"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }


}