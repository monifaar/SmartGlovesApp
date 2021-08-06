package com.garda.smartglovesapp1.profile.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel (
        var name: String? = null
): Parcelable