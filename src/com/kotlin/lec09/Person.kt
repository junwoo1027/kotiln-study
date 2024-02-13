package com.kotlin.lec09

class Person(
    val name: String = "wow",
    var age: Int = 25
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException()
        }
        println("초기화")
    }

    val uppercaseName: String
        get() = this.name.uppercase()

    val isAdult: Boolean
        get() = this.age >= 20

//    constructor(name: String): this(name, 1) {
//        println("부생성자 1")
//    }
//
//    constructor(): this("hello") {
//        println("부생성자 2")
//    }
}