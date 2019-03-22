package com.example.myfirstkotlinapp

import android.os.Build
import android.support.annotation.RequiresApi
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

private val name_global: String = "Hallo" // in gleicher Dateiebene sichtbar
val name_for_all: String = "Welt!"
internal val name_for_all_in_modul: String = "Hallo Welt!" // auf Modulebene sichtbar

@RequiresApi(Build.VERSION_CODES.N)
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(p0: Int, p1: Int): Int = p0 + p1
    },
    MINUS {
        override fun apply(p0: Int, p1: Int): Int = p0 - p1
    },
    MAL {
        override fun apply(p0: Int, p1: Int): Int = p0 * p1
    },
    GETEILT {
        override fun apply(p0: Int, p1: Int): Int = p0 / p1
    };

    override fun applyAsInt(p0: Int, p1: Int): Int = apply(p0, p1)

}


interface MyInterface {
    val prop1: Int
        get() = 11
    var prop2: Int

    fun bar() {
        print("A")
    }

    fun foo()
}

interface MyInterface2 {
    val prop1: Int
        get() = 100
    var prop2: Int

    fun bar() {
        print("B")
    }

    fun foo() {
        print("BB")
    }
}

class Parent1 : MyInterface, MyInterface2 {

    protected val name2: String = "Hallo"
    override fun bar() {
        super<MyInterface>.bar()
    }

    override val prop1: Int = 29
    override var prop2: Int = 22

    var prop3: Int = 1    // getter und setter einer Property
        get() = field
        set(value) {
            field = value
        }

    override fun foo() {
        super<MyInterface2>.prop1 + prop1
        name_global
    }

}

open class A {
    open fun doIt(value: String = "DefaultString") {
        print(value)
    }
    fun setParams(str:String,b1:Boolean=true,b2:Boolean=true,b3:Boolean=true,b4:Boolean=true, str2:String=""){

    }
}

class B : A() {
    override fun doIt(value: String) {
        print(value + " ...")
        A().doIt()
        A().setParams("Hallo",b2 = false,str2 = "xy")
    }
}