package com.kotlin.lec10

class Penguin(
    species: String,
) : Animal(species, 2), Flyable, Swimable {
    private var wingCount: Int = 2

    override fun move() {
        println("penguin move!")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        println("fly!")
    }
}