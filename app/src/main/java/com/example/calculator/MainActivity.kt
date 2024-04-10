package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main)  {

    private var clickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView: TextView = findViewById(R.id.my_text)
        textView.text = "Кнопка была нажата $clickCount раз"

        textView.setOnClickListener {
            Log.e("MY_TAG", "My message")
        }

        val button: Button = findViewById(R.id.increment_button)
        button.setOnClickListener {
            clickCount++
            textView.text = "Кнопка была нажата $clickCount раз"
        }
    }
}