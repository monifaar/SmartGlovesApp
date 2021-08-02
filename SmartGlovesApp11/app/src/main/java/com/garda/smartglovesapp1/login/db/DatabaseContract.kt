package com.garda.smartglovesapp1.login.db

import android.provider.BaseColumns

object DatabaseContract {
        object FeedLogin : BaseColumns {
            const val TABLE_NAME = "login"
            const val _ID = "_id"
            const val COLUMN_NAME_EMAIL = "email"
            const val COLUMN_NAME_PASSWORD = "password"
        }
}