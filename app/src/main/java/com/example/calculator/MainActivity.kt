package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {

    private var clickCount: Int = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val textView: TextView = findViewById(R.id.my_text)
//        textView.text = "Кнопка была нажата $clickCount раз"
        binding.myText.text = "Кнопка была нажата $clickCount раз"

//        textView.setOnClickListener {
        binding.myText.setOnClickListener {
            Log.e("MY_TAG", "My message")
        }

//        val button: Button = findViewById(R.id.increment_button)
//        button.setOnClickListener {
        binding.incrementButton.setOnClickListener {
            clickCount++

//            textView.text = "Кнопка была нажата $clickCount раз"
            binding.myText.text = "Кнопка была нажата $clickCount раз"
//            if (binding.myText.visibility == View.VISIBLE) {
//                binding.myText.visibility = View.INVISIBLE
//            } else {
//                binding.myText.visibility = View.VISIBLE
//            }
        }
    }
}