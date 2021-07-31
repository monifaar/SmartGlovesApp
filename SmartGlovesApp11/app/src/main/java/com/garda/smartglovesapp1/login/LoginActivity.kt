package com.garda.smartglovesapp1.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.home.HomeActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnMoveActivity: Button = findViewById(R.id.button_signin)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_signin -> {
                val moveIntent = Intent(this, HomeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}