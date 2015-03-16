package com.epam.zt.text;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String filename = "text.txt";
        String text = TextReader.readFromFile(filename);
        System.out.println(text);
    }
}
