package com.example.colorpicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ColorPicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_picker)

        findViewById<Button>(R.id.button).setOnClickListener{
            val red= findViewById<EditText>(R.id.red)
            val green= findViewById<EditText>(R.id.green)
            val blue= findViewById<EditText>(R.id.blue)

            // R G B
            //* FF FF FF White

            val colorstr= "#${red.text}${green.text}${blue.text}"
            val color= Color.parseColor(colorstr)

            findViewById<ImageView>(R.id.image).setColorFilter(color)


        }

    }
}