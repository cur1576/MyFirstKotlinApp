package com.example.myfirstkotlinapp

import android.os.Build
import android.support.annotation.RequiresApi
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

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
    }

}