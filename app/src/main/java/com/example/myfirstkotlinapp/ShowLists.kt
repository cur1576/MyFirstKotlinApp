package com.example.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_lists.*

class ShowLists : AppCompatActivity() {

    private val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_lists)
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val numbers2 = arrayOf<Int>(1, 2, 3, 4, 5)
        val values = arrayOf(1, 2, numbers, numbers2, 3, 4, 5, "Hallo")
        val numbers3 = IntArray(10) { i -> -1 } // initialisiert jede Position im Array mit -1
        val numbers4 = IntArray(5, { i -> i * 10 })
//        val twoDimArray = Array(10, { i -> IntArray(10, { i -> 0 }) })  // ??
        val twoDimArray = Array(10, { IntArray(10, { it + 1 }) })

        val zahl1 = 123
        val zahl2 = 234

        val name = "Hallo"



        val max = maxValue(zahl1, zahl2)


        for (array in twoDimArray) {
            for ((index, i) in array.withIndex()) {
                textView.append("$index : $i ")
            }
            textView.append("\n")
        }

    }

    fun maxValue(zahl1: Int, zahl2: Int) = if (zahl1 > zahl2) zahl1 else zahl2

    fun maxValueJ(zahl1: Int, zahl2: Int): Int {
      return  if (zahl1 > zahl2) {
             zahl1
        } else {
             zahl2
        }
    }
}