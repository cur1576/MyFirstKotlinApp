package com.example.myfirstkotlinapp

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.view.ViewParent
import kotlinx.android.synthetic.main.activity_nullsafety.*
import java.lang.IllegalArgumentException

class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nullsafety)

        var a: String = "abc"

//        a = null  // zur Laufzeit kann eine Variable nicht null sein!

        var b: String? = "abc"

        b = null  // mit ? kann die Variable -> null sein

        val l = a.length

        var length: Int? = if (b != null) b.length else -1

        length = b?.length

        length?.compareTo(2)

        val listWithNulls: List<String?> = listOf("Hallo ", null, "Welt!")
        val stringList : List<String> = listWithNulls.filterNotNull()

        for (item in listWithNulls) {
            item?.let {
                textView2.append("$it mit länge ${it?.length}")
            }
        }
        for(itm in stringList){
            textView2.append("$itm mit länge ${itm.length}")
        }
        b = foo(Node("A", "Frank"))
        val c: Int = b?.length ?: -1
        textView2.append("\n\n $b")

        val str = "123444"
//        val int :Int? = str as? Int  // ?? Konvertierung ??
        val int :Int? = str.toInt() // Konvertierung
        textView2.append(int.toString())

    }

    fun foo(node: Node): String? {
        val parent = node.parent ?: return null
        val name = node.name ?: throw IllegalArgumentException()
        return name
    }
}

class Node(val parent: String?, val name: String?)