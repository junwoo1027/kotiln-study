package com.kotlin.lec07

fun main() {
    println( parseIntOrThrow("10"))
    val filePrinter = FilePrinter()
    filePrinter.readFile()
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}