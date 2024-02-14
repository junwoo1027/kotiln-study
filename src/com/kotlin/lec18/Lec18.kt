package com.kotlin.lec18

fun main() {
    val fruits = listOf(
        Fruit(1L, "apple", 1000, 3000),
        Fruit(2L, "banana", 1200, 3100),
        Fruit(3L, "apple", 1300, 3200),
        Fruit(4L, "banana", 1400, 3300),
        Fruit(5L, "banana", 1500, 3400),
        Fruit(6L, "melon", 1600, 3500),
        Fruit(7L, "apple", 1700, 3600),
        Fruit(8L, "melon", 1800, 3000),
    )

    fruits.filter { fruit: Fruit -> fruit.name == "apple" }.map { fruit: Fruit -> fruit.currentPrice }

    fruits.filterIndexed { idx, fruit ->
//        println(idx)
        fruit.name == "apple"
    }

    fruits.filter { fruit: Fruit -> fruit.name == "apple" }.mapIndexed { idx, fruit: Fruit ->
//        println(idx)
        fruit.currentPrice
    }

    fruits.filter { fruit: Fruit -> fruit.name == "apple" }.mapNotNull { }

    val isApple = fruits.all { fruit: Fruit -> fruit.name == "apple" } // 조건을 모두 만족하면 true
    val isNoApple = fruits.none { fruit: Fruit -> fruit.name == "apple" } // 조건을 모두 불만족하면 true
    val any = fruits.any { fruit: Fruit -> fruit.factoryPrice > 1000 } // 조건을 하나라도 만족하면 true
    println(any)

    fruits.count()

    fruits.sortedBy { fruit: Fruit -> fruit.currentPrice } // 오름차순
    fruits.sortedByDescending { fruit: Fruit -> fruit.currentPrice }

    fruits.distinctBy { fruit: Fruit -> fruit.name }.map { fruit: Fruit -> fruit.name }

    fruits.first()
    fruits.firstOrNull()

    fruits.last()
    fruits.lastOrNull()

    val groupBy: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    val associateBy: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    val groupBy1: Map<String, List<Long>> =
        fruits.groupBy({ fruit -> fruit.name }, { fruit: Fruit -> fruit.factoryPrice })
    val associateBy1 = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    val map = fruits.groupBy { fruit -> fruit.name }.filter { (key, value) -> key == "apple" }

    val listOf: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "apple", 1000, 3000),
            Fruit(2L, "banana", 1200, 3100),
            Fruit(3L, "apple", 1300, 3200),
            Fruit(4L, "banana", 1400, 3300),
        ),
        listOf(
            Fruit(5L, "banana", 1500, 3400),
            Fruit(6L, "melon", 1600, 3500),
            Fruit(7L, "apple", 1700, 3600),
        ),
        listOf(

            Fruit(8L, "melon", 1800, 3000),
        )
    )

    val flatMap: List<Fruit> = listOf.flatMap(List<Fruit>::samePriceFilter)
    val flatten = listOf.flatten()
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)
