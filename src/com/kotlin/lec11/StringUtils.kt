package com.kotlin.lec11

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}