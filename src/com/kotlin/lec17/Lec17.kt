package com.kotlin.lec17

fun main() {
    val fruits = listOf(
        Fruit("apple", 1000),
        Fruit("apple", 1200),
        Fruit("apple", 1300),
        Fruit("apple", 1400),
        Fruit("apple", 1500),
        Fruit("apple", 1600),
        Fruit("banana", 2000),
        Fruit("banana", 2200),
        Fruit("banana", 3300),
        Fruit("banana", 3400),
        Fruit("melon", 3000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "apple"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "apple" }

    filterFruits(fruits, isApple)
    filterFruits(fruits) { fruit -> fruit.name == "apple" }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}
