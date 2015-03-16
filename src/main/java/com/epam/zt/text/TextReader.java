package com.epam.zt.text;

import java.io.*;

public abstract class TextReader {
    public static String readFromFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(filename);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String str;
                while ((str = in.readLine()) != null) {
                    sb.append(str);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
