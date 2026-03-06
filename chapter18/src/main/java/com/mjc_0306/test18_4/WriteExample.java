package com.mjc_0306.test18_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("D:/Temp/test.txt");

            char a = 'A';
            char b = 'B';
            writer.write(a);
            writer.write(b);

            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            writer.write("FGH");
            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
