package com.dgopadakak.cicdlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_times_two).setOnClickListener {
            findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesTwo(
                findViewById<EditText>(R.id.edit_text_number).text.toString().toInt()
            ).toString()
        }

        findViewById<Button>(R.id.button_times_three).setOnClickListener {
            findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesThree(
                findViewById<EditText>(R.id.edit_text_number).text.toString().toInt()
            ).toString()
        }

        findViewById<Button>(R.id.button_times_four).setOnClickListener {
            findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesFour(
                findViewById<EditText>(R.id.edit_text_number).text.toString().toInt()
            ).toString()
        }
    }
}