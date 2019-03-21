package com.example.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class Output : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)
        val value = intent.getStringExtra("value")
        ausgabe.text = "Die Ausgabe von Seite 1 ist : $value, fertig ist der Text"
    }
}
