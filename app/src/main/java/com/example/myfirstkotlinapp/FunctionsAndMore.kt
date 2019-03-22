package com.example.myfirstkotlinapp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_functions_and_more.*

class FunctionsAndMore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions_and_more)
        var j = 2
        val h = (j uper 3) + 7

//        j.uper(3) // hierfür braucht man kein "infix

        val str1: Node = Node("Frank","Neumann")
        val str2: Node = Node("Frank","Neumann")
        val str3:Node = str2
        val node1 :AllofNode=Node2("Frank","Neumann")

        if(node1 is Node2)
            textView4.append("node1 ist ein Node2")

        j uper 3 // in dieser Schreibweise wird "infix" benötigt
        textView4.append(j.toString() + " " + j.uper(3))
        textView4.append("\n " + str1.equals(str2)  + " " +  str3.equals(str2))
        textView4.append("\n " + (str1 == str2) + " " +  (str3 == str2))
        textView4.append("\n " + (str1 === str2) + " " +  (str3 === str2))
    }

    infix fun Int.uper(i: Int): Int {  // <- siehe Anmerkung oben
        return this * i
    }
}
