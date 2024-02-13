package com.kotlin.lec14

import com.kotlin.lec14.car.Avante
import com.kotlin.lec14.car.Grandeur
import com.kotlin.lec14.car.HyundaiCar
import com.kotlin.lec14.car.Sonata

fun main() {
    val personDto = PersonDto(name = "junwoo", age = 30)
    val personDto2 = PersonDto("junwoo", 30)

    println(personDto == personDto2)
    println(personDto)

    handleCountry(Country.KOREA)

    val avante = Avante()
    handleCar(avante)
}

private fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> {
            println(country.name)
        }
        Country.AMERICA -> println(country.name)
    }
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println(car.name)
        is Grandeur -> println(car.name)
        is Sonata -> println(car.name)
    }
}