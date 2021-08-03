package com.garda.smartglovesapp1.login.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.login.LoginActivity
import com.garda.smartglovesapp1.login.db.LoginModel
import com.garda.smartglovesapp1.login.db.RegisterHelper

class RegisterActivity : AppCompatActivity() {

    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPass: EditText
    lateinit var edtConfirm: EditText
    lateinit var textHave: TextView
    lateinit var btnRegister: Button
    lateinit var registerHelper: RegisterHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtName = findViewById(R.id.nameReg)
        edtEmail = findViewById(R.id.emailReg)
        edtPass = findViewById(R.id.passwordReg)
        edtConfirm = findViewById(R.id.confirmPasswordReg)
        textHave = findViewById(R.id.haveAcc)
        btnRegister = findViewById(R.id.button_reg)
        btnRegister.setOnClickListener{register()}

        registerHelper = RegisterHelper(this)
    }

    fun register() {
        val name:String = edtName.text.toString()
        val email:String = edtEmail.text.toString()
        val pass:String = edtPass.text.toString()
        val confirm:String = edtConfirm.text.toString()

        if (name.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty() && confirm.isNotEmpty())  {
            if(pass == confirm){
                try {
                    val register = registerHelper.insertUser(LoginModel(reg = name, email = email, password = pass))
                    if (register > -1) {
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                    }
                }
                catch (e:Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(this, "Password is not same", Toast.LENGTH_SHORT).show()
            }
        }
        else {
            Toast.makeText(this, "Field is not required", Toast.LENGTH_SHORT).show()
        }
    }
}