package com.example.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nik = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textzero = findViewById<TextView>(R.id.text)
        var zero = findViewById<TextView>(R.id.zero)
        val plus = findViewById<Button>(R.id.plus)
        val mines = findViewById<Button>(R.id.mines)


        plus.setOnClickListener {

            nik = nik + 1
            zero.text = nik.toString()

        }
        mines.setOnClickListener {
            nik= nik - 1
            zero.text = nik.toString()}





        }
    }




