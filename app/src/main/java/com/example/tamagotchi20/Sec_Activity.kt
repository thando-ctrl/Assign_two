package com.example.tamagotchi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Sec_Activity : AppCompatActivity() {

    //Declaring local variables
    lateinit var buttonF: Button
    lateinit var buttonC: Button
    lateinit var buttonP: Button
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        //linking variables to widgets
        buttonF= findViewById(R.id.button_f)
        buttonC= findViewById(R.id.button_c)
        buttonP= findViewById(R.id.button_p)
        image= findViewById(R.id.imageView)

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
            }


    }
}