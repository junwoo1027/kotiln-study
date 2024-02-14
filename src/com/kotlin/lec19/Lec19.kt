package com.kotlin.lec19

import com.kotlin.lec19.a.printHelloWorld as printHelloWorldA

fun main() {
    test { true }

    printHelloWorldA()

    val person = Person("junwoo", 30)
    val (name, age) = person
    println("${name} ${age}")

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }.forEach { number -> println(number) }

    println(getNumberOrNullV1(1))
    println(gegNumberOrNullV2(-1))
}

typealias Filter = () -> Boolean
private fun test(filter: Filter) {
    println(filter)
}

typealias USMap = Map<String, UltraSuper>
data class UltraSuper(
    val name: String
)

data class Person(
    val name: String,
    val age: Int
)

fun getNumberOrNullV1(number: Int): Int? {
    return number.takeIf { it > 0 } // 주어진 조건을 만족하지 않으면 null
}

fun gegNumberOrNullV2(number: Int): Int? {
    return number.takeUnless { it <= 0 } // 주어진 조건을 만족하면 null
}