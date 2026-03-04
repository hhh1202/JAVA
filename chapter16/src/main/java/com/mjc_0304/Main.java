package com.mjc_0304;

import com.mjc_0304.lambda.LambdaUseInterface;
import com.mjc_0304.lambda.NormalUseInterface;

public class Main {
    public static void main(String[] args) {
        NormalUseInterface nui = new NormalUseInterface();
        nui.doSome();

        LambdaUseInterface lui = new LambdaUseInterface();
        lui.doSome((str, n) -> {
           System.out.println(str.length() == n ? " 같다 " + n : "다르다");
        }, "def", 3);

        lui.doSome((sss, i) -> {
            for( int m = 0; m < i; m++ ) {
                System.out.println(sss);
            }
            System.out.println();
        }, "def", 3);
    }
}