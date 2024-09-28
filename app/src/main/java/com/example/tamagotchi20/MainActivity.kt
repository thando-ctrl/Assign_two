package com.example.tamagotchi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declaring Local Variables
    lateinit var ebutton: Button
    lateinit var etextview: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking variables to widgets
        ebutton = findViewById(R.id.button)
        etextview = findViewById(R.id.textView)
    }
}