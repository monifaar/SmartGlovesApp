package com.garda.smartglovesapp1.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.databinding.ActivityProfileImgBinding
import com.garda.smartglovesapp1.profile.model.UserModel
import com.garda.smartglovesapp1.profile.model.UserPreference

class ProfileImgActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_TYPE_FORM = "extra_type_form"
        const val EXTRA_RESULT = "extra_result"
        const val RESULT_CODE = 101
        const val TYPE_ADD = 1
        const val TYPE_EDIT = 2
        private const val FIELD_REQUIRED = "Field can not empty"
    }

    private lateinit var userModel: UserModel

    private lateinit var binding: ActivityProfileImgBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileImgBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_save) {
            val name = binding.edtName.text.toString().trim()

            if (name.isEmpty()) {
                binding.edtName.error = FIELD_REQUIRED
                return
            }

            saveUser(name)

            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_RESULT, userModel)
            setResult(RESULT_CODE, resultIntent)

            finish()
        }
    }

    private fun saveUser(name:String) {
        val userPreference = UserPreference(this)
        userModel.name = name
        userPreference.setUser(userModel)
        Toast.makeText(this, "Data was saved", Toast.LENGTH_SHORT).show()
    }
}