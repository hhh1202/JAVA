package com.mjc_0306.test18_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:/Temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStream os2 = new FileOutputStream("D:/Temp/test2.db");

            byte[] array = { 10, 20, 30 };

            os2.write(array);

            os2.flush();
            os2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStream os3 = new FileOutputStream("D:/Temp/test3.db");

            byte[] array = { 10, 20, 30, 40, 50 };

            os3.write(array, 1, 3);

            os3.flush();
            os3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
