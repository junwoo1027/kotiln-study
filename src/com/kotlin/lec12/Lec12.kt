package com.kotlin.lec12

fun main() {
    val newBaby = Person.newBaby("junwoo")
    println(newBaby.name)

    println(Singleton.a)
    println(Singleton.a + 10)

    moveSomething(object : Movable {
        override fun move() {
            println("Move!")
        }

        override fun fly() {
            println("Fly!")
        }

    })
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}