package com.shubham.aeromaintain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//Selection
class selection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

    //linking both btn
    val partbtn:Button=findViewById<Button>(R.id.partbtn)
        partbtn.setOnClickListener {
            val s=Intent(this,scanner::class.java)
            startActivity(s)
        }
    val recordbtn:Button=findViewById<Button>(R.id.recordbtn)
        recordbtn.setOnClickListener {
            val v=Intent(this,scanner::class.java)
            startActivity(v)
        }

    }
}
