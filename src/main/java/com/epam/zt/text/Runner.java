package com.epam.zt.text;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String filename = "text.txt";
        TextWriter writer = new TextWriter();
        writer.writeToFile(filename);
        TextReader reader = new TextReader();
        String text = reader.readFromFile(filename);
        System.out.println(text);

    }
}
