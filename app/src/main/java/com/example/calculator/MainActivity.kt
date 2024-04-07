package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main)  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView: TextView = findViewById(R.id.my_text)
        textView.text = "Мой новый текст"

        textView.setOnClickListener {
            Log.i("MY_TAG", "My message")
        }
    }
}