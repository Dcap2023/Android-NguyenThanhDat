package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.login.R.id.loginButton


class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val loginButton = findViewById<Button>(loginButton)
        loginButton.setOnClickListener(View.OnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        })




}
}