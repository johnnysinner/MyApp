package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun main() {
        println("Hello world!")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textSad : TextView = findViewById(R.id.textViewSad)

        var buttonSad : Button = findViewById(R.id.buttonSad)

        var one = 1
        var two = 2

        var three = one + two
        buttonSad.setOnClickListener {
            textSad.setText("$three")

        }
    }


}
