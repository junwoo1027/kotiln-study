package com.kotlin.lec12

class Person private constructor(
    val name: String,
    val age: Int
) {
    // static
    companion object {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}