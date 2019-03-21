package com.example.myfirstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
            80,42,true)

//        val p3 = p2.copy()   // benoetigt "data" - Modifizierer

        tv.append("\n" + p2.strasse)
//        tv.append("\n" + p3.alter)
        tv.append("\n"+ JavaActivity().doit())
    }

    fun send(view : View){
        val intent = Intent(this,Output::class.java)
        intent.putExtra("value",tv.text.toString())

        test() // Methode ist außerhalb der klasse!!

        startActivity(intent)
    }
}

// geht auch ausserhalb von Klassen!!
fun test(){
    print("Hallo!")
}