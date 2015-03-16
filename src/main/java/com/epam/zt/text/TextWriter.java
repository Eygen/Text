package com.epam.zt.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextWriter {
    public TextWriter() {
    }

    public void writeToFile(String filename) throws FileNotFoundException {
        String text = "125987";
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        try {
            out.print(text);
        } finally {
            out.close();
        }
    }
}
