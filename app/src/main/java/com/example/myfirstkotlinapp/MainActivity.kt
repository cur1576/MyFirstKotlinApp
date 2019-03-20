package com.example.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setText("Hello Kotlin!")
       val p = Person("Max", "Mustermann", "MusterStr","Berlin", "12345",
            80,42)

        tv.append("\n" + p.alter)

        val p2 = PersonK("Max", "Mustermann", "MusterStr","Berlin", "12345",
            80,42)

        val p3 = p2.copy()

        tv.append("\n" + p2.alter)
        tv.append("\n" + p3.alter)
        tv.append("\n"+ JavaActivity().doit())
    }
}
