package com.kotlin.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 2
    val number4: Long = number3?.toLong() ?: 0L

    val person = Person("junwoo", 100)
    printAgeIfPerson2(person)
    println("hi ${person.name} wow ${person.age}")

    val trimIndent = """
        hi
        oh
        good
    """.trimIndent()
    println(trimIndent)

    val str = "ABC"
    println(str[0])
    println(str[2])
}

// Java Object == Any
fun printAgeIfPerson1(obj: Any) {
    // is == instanceof, !is
    if(obj is Person) {
//        val person = obj as Person
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}