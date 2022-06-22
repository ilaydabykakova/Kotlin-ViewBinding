package com.ilaydabykakova.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.ilaydabykakova.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var textView: TextView

    //3. Option
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //3. Option
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //binding.textView.text = "On Create Below Code"
        //2. Option
       // val textView = findViewById<TextView>(R.id.textView)
    }

    fun changeName(view: View){
        //println("clicked")
        // 1 & 2 Option
        // textView.text = "Hello Kotlin !"
        binding.textView.text = "Hello Kotlin"

    }
}