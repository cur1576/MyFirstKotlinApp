package com.example.myfirstkotlinapp

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

    fun foo(){
        print("BB")
    }
}

class Parent1 : MyInterface, MyInterface2 {
    override fun bar() {
        super<MyInterface>.bar()
    }

    override val prop1: Int = 29
    override var prop2: Int = 22

    var prop3 : Int = 1    // getter und setter einer Property
        get() = field
        set(value) {field = value}

    override fun foo() {
        super<MyInterface2>.prop1 + prop1
    }

}