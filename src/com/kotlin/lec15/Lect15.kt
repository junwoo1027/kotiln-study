package com.kotlin.lec15

fun main() {

    // Array
    val array = arrayOf(100, 200)
    val plus = array.plus(300)

    for (i in plus) {
        println(i)
    }

    for ((index, value) in array.withIndex()) {
        println("${index} ${value}")
    }

    // List
    val list1 = listOf(1, 2, 3)
    val emptyList = emptyList<Int>()

    println(list1[1])

    val mutableList = mutableListOf(100, 200)
    mutableList.add(300)
    mutableList.removeAt(0)

    for (i in mutableList) {
        println(i)
    }

    // Set
    val set1 = setOf(100, 200, 200)
    for (i in set1) {
        println(i)
    }
    val set2 = mutableSetOf(10, 20)

    // Map
    val map1 = mutableMapOf<Int, String>()
    map1[1] = "a"
    map1[2] = "b"

    for ((key, value) in map1.entries) {
        println(key)
        println(value)
    }

    val map2 = mapOf(1 to "A", 2 to "B")
}