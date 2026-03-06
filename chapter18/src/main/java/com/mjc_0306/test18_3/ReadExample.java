package com.mjc_0306.test18_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args){
        try {
            InputStream is = new FileInputStream("D:/Temp/test1.db");

            while(true) {
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            InputStream is2 = new FileInputStream("D:/Temp/test2.db");

            byte[] data = new byte[100];

            while(true) {
                int num = is2.read(data);
                if(num == -1) break;

                for(int i=0; i<num; i++) {
                    System.out.println(data[i]);
                }
            }

            is2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
