package com.garda.smartglovesapp1.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.home.HomeActivity
import com.garda.smartglovesapp1.login.db.LoginHelper
import com.garda.smartglovesapp1.login.db.LoginModel
import com.garda.smartglovesapp1.login.register.RegisterActivity

class LoginActivity : AppCompatActivity(){
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var btnMoveActivity: Button
    lateinit var textNoAcc:TextView
    lateinit var loginHelper: LoginHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnMoveActivity = findViewById(R.id.button_signin)
        btnMoveActivity.setOnClickListener{login()}

        textNoAcc = findViewById(R.id.btn_reg)
        textNoAcc.setOnClickListener{
            val moveIntent = Intent(this, RegisterActivity::class.java)
            startActivity(moveIntent)
        }

        edtEmail = findViewById(R.id.email)
        edtPassword = findViewById(R.id.password)
        loginHelper = LoginHelper(this)

    }

    fun login() {
        val email:String = edtEmail.text.toString()
        val pass:String = edtPassword.text.toString()

        if (email.isNotEmpty() && pass.isNotEmpty() )  {
            try {
                val login = loginHelper.checkEmailPass(email = email, password = pass)
                if (login) {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
            catch (e:Exception) {
                e.printStackTrace()
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
        else {
            Toast.makeText(this, "Field is not required", Toast.LENGTH_SHORT).show()
        }
    }
}
