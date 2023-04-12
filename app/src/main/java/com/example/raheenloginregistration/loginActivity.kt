package com.example.raheenloginregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginActivity : AppCompatActivity() {
     lateinit var texttoregister:Textview
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        texttoregister = findViewById(R.id.Txt_gotoregister)

        texttoregister.setOnClickLister {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }


    }
    }