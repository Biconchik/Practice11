package com.example.practice_11


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ButtonClick (view : View){
        val image: ImageView = findViewById(R.id.imageView3)
        image.setImageResource(R.drawable.apple)
        val button_image: ImageButton = findViewById(R.id.imageButton)
        button_image.setImageResource(R.drawable.pear)
    }

}

