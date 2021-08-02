package com.garda.smartglovesapp1.login.db

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class LoginModel (
    var id: Int? = 0,
    var email: String? = "",
    var password: String? = ""
)
: Parcelable