package com.kotlin.lec08

fun main() {
    println(max(2, 5))
    repeat("hello")
    repeat("wow", useNewLine = false)

    nameAndGender(name = "junwoo", gender = "MALE")

    printAll("A", "B", "C")

    val strings = arrayOf("D", "E", "F")
    printAll(*strings)
}

fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// named argument
fun nameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}