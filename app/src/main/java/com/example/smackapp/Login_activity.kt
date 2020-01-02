package com.example.smackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login_activity : AppCompatActivity() {
    fun OnSignUp(view: View)
    {
        val hadiint=Intent(this,sign_up_activity::class.java)
        startActivity(hadiint)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)

    }

}
