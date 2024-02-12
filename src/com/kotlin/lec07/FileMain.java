package com.kotlin.lec07;

import java.io.IOException;

public class FileMain {
    public static void main(String[] args) throws IOException {
        JavaFilePrinter javaFilePrinter = new JavaFilePrinter();
        javaFilePrinter.readFile();
    }
}
