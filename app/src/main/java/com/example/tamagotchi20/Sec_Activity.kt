package com.example.tamagotchi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Sec_Activity : AppCompatActivity() {

    //Declaring local variables
    lateinit var buttonF: Button
    lateinit var buttonC: Button
    lateinit var buttonP: Button
    lateinit var atext: TextView
    lateinit var btext: TextView
    lateinit var ctext: TextView
    lateinit var image: ImageView
    private var count1 = 10
    private var count2 = 0
    private var count3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        //linking variables to widgets
        buttonF= findViewById(R.id.button_f)
        buttonC= findViewById(R.id.button_c)
        buttonP= findViewById(R.id.button_p)
        image= findViewById(R.id.imageView)
        atext= findViewById(R.id.textView1)
        btext= findViewById(R.id.textView2)
        ctext= findViewById(R.id.textView3)


        //Upon clicking the Feed button
        buttonF.setOnClickListener {

            if (image.tag == "welcome" || image.tag == "playing" || image.tag == "bath")
            {
                image.setImageResource(R.drawable.feeding)
                image.tag = "feeding"
            } else {
                image.setImageResource(R.drawable.welcome)
                image.tag = "welcome"
            }
            count1--
            atext.text = "$count1"

        }
        //Upon clicking the clean button
        buttonC.setOnClickListener {

            if (image.tag == "welcome" || image.tag == "feeding" || image.tag == "playing")
            {
                image.setImageResource(R.drawable.bath)
                image.tag = "bath"
            } else {
                image.setImageResource(R.drawable.welcome)
                image.tag = "welcome"
            }
            count2++
            btext.text = "$count2"
        }
        //Upon clicking the play button
        buttonP.setOnClickListener {

            if (image.tag == "welcome" || image.tag == "bath" || image.tag == "feeding")
            {
                image.setImageResource(R.drawable.playing)
                image.tag = "playing"
            } else {
                image.setImageResource(R.drawable.welcome)
                image.tag = "welcome"
            }
            count3++
            ctext.text = "$count3"
            }


    }
}