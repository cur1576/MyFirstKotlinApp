package com.example.myfirstkotlinapp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_functions_and_more.*

class FunctionsAndMore : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions_and_more)
        var j = 2
        val h = (j uper 3) + 7
//        j.uper(3) // hierfür braucht man kein "infix
         j uper 3 // in dieser Schreibweise wird "infix" benötigt
        textView4.append(j.toString() + " " + j.uper(3))
    }

    infix fun Int.uper(i:Int):Int{  // <- siehe Anmerkung oben
        return this*i
    }
}
