package com.example.myfirstkotlinapp

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.ViewParent
import kotlinx.android.synthetic.main.activity_nullsafety.*
import java.io.Closeable
import java.io.Serializable
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
        val stringList: List<String> = listWithNulls.filterNotNull()

        for (item in listWithNulls) {
            item?.let {
                textView2.append("$it mit länge ${it?.length}")
            }
        }
        for (itm in stringList) {
            textView2.append("$itm mit länge ${itm.length}")
        }
        b = foo(Node("A", "Frank"))
        val c: Int = b?.length ?: -1
        textView2.append("\n\n $b")

        val str = "123444"
//        val int :Int? = str as? Int  // ?? Konvertierung ??
        val int: Int? = str.toInt() // Konvertierung
        textView2.append(int.toString())

//        val runner = Runnable {
//            Log.d("A","Thread läuft")
//        }
//        Thread(runner).start()

        Thread(Runnable {
            Log.d("AAA", "Thread läuft")
            Thread.sleep(5000)
            Log.d("AAA", "Thread läuft immernoch")
        }).start()

        val a_num = 4
        val b_num = 10

        var arithmetics: IntArithmetics = IntArithmetics.PLUS
        Log.d("AAA", "Aus dem UI-Thread")
        textView2.append("$arithmetics($a_num,$b_num) = ${arithmetics.applyAsInt(a_num, b_num)}")

        button3.setOnClickListener {
            startActivity(Intent(this, FunctionsAndMore::class.java))
        }
    }

    fun foo(node: Node): String? {
        val parent = node.parent ?: return null
        val name = node.name ?: throw IllegalArgumentException()
        return name
    }
}
interface AllofNode

data class Node(val parent: String?, val name: String?):AllofNode //{ // data - Klassen können nicht "open" sein!!
//    constructor():this(null,null)
//    constructor(name: String):this(null,name)
// }

data class Node2(val parent: String?, val name: String?, val Ort: String? = null):AllofNode { // Vererbung -> überflüssig?
    fun fromNode(node: Node): Node2 = Node2(node.parent, node.name)
}

open class NodeChild(strasse: String?, ort: String?) : Serializable, Closeable {
    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}