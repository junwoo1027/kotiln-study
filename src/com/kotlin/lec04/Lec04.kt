package com.kotlin.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2) { // compareTo
        println("money1이 money2 보다 금액이 더 크다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4)
    println(money3 === money5)
    println(money3 == money5) // equals

}