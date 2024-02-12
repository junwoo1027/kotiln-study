package com.kotlin.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    // Kotlin은 모두 Unchecked Exception
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile2(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}