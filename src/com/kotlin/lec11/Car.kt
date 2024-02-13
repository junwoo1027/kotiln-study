package com.kotlin.lec11

class Car internal constructor(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    var price = _price
        private set
}