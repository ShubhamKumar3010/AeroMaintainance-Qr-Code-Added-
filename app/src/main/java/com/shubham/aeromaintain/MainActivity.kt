package com.shubham.aeromaintain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//linking
    val button=findViewById<Button>(R.id.button)
    button.setOnClickListener {
        val skill=Intent(this,selection::class.java)
        startActivity(skill)
    }
    }


}


