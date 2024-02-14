package com.kotlin.lec16

fun main() {
    val a = "abc"
    println(a.lastChar())

    val train: Train = Train()
    val str: Train = Str()
    val str1: Str = Str()

    train.isFunc()
    str.isFunc()
    str1.isFuc()

    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)
    println(3.add3(4))
}

fun Train.isFunc() {
    println("Train")
}

fun Str.isFuc() {
    println("Str")
}