package com.mjc_0306.test18_7;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
                new FileReader("src/main/java/com/mjc_0306/test18_7/ReadLineExample.java")
        );

        int lineNo = 1;
        while(true) {
        String str = br.readLine();
        if(str == null) break;
        System.out.println(lineNo + "\t" + str);
        lineNo++;
        }

        br.close();
    }
}
