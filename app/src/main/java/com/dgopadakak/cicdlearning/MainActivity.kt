package com.dgopadakak.cicdlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_times_two).setOnClickListener {
            multiplyButtonsHandler(it)
        }

        findViewById<Button>(R.id.button_times_three).setOnClickListener {
            multiplyButtonsHandler(it)
        }

        findViewById<Button>(R.id.button_times_four).setOnClickListener {
            multiplyButtonsHandler(it)
        }
    }

    private fun multiplyButtonsHandler(button: View) {
        val tempNumString = findViewById<EditText>(R.id.edit_text_number).text.toString()
        if (tempNumString == "") {
            findViewById<TextView>(R.id.text_view_result).text =
                getString(R.string.please_enter_a_number_text)
        } else {
            when(button.id) {
                R.id.button_times_two -> findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesTwo(
                    tempNumString.toInt()
                ).toString()
                R.id.button_times_three -> findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesThree(
                    tempNumString.toInt()
                ).toString()
                R.id.button_times_four -> findViewById<TextView>(R.id.text_view_result).text = Multiplier().timesFour(
                    tempNumString.toInt()
                ).toString()
            }
        }
    }
}