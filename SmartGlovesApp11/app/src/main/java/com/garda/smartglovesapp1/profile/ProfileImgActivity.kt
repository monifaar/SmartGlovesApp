package com.garda.smartglovesapp1.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.garda.smartglovesapp1.R

class ProfileImgActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TYPE_FORM = "extra_type_form"
        const val EXTRA_RESULT = "extra_result"
        const val RESULT_CODE = 101
        const val TYPE_ADD = 1
        const val TYPE_EDIT = 2
        private const val FIELD_REQUIRED = "Field tidak boleh kosong"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_img)
    }
}