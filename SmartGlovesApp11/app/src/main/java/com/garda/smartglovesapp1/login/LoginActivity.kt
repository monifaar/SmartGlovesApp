package com.garda.smartglovesapp1.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.home.HomeActivity
import com.garda.smartglovesapp1.login.db.LoginHelper
import com.garda.smartglovesapp1.login.register.RegisterActivity

class LoginActivity : AppCompatActivity(){
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var db:LoginHelper
    lateinit var btnMoveActivity: Button
    lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnMoveActivity = findViewById(R.id.button_signin)

        text = findViewById(R.id.btn_reg)
        text.setOnClickListener{
            val moveIntent = Intent(this, RegisterActivity::class.java)
            startActivity(moveIntent)
        }

        edtEmail = findViewById(R.id.email)
        edtPassword = findViewById(R.id.password)
        db = LoginHelper(this)

//        btnMoveActivity.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                val email:String = edtEmail.text.toString()
//                val pass: String = edtPassword.text.toString()
//                val check = db.checkEmailPass(email, pass)
//        when (check == true) {
//            check-> {
//                Toast.makeText(this@LoginActivity, "Sign In Success",Toast.LENGTH_SHORT).show()
//                    val moveIntent = Intent(this@LoginActivity, HomeActivity::class.java)
//                    startActivity(moveIntent)
//                }
//            else -> Toast.makeText(this@LoginActivity, "Sign In Failed",Toast.LENGTH_SHORT).show()
//            }
//
//            }
//
//        })
    }
//    override fun onClick(v: View?) {
//        when (v?.id) {
//                R.id.btn_reg -> {
//                    val moveIntent = Intent(this, RegisterActivity::class.java)
//                    startActivity(moveIntent)
//                }
//            }
//
//        }
    }
