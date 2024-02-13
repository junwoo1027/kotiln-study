package com.kotlin.lec10

fun main() {
    val penguin = Penguin("peng")

    penguin.move()
    println(penguin.legCount)
    penguin.act()
    penguin.fly()
}