package com.mjc_0304.lambda;

public class ClassString2 implements MyString {
    @Override
    public void procString(String str, int num) {
        for(int i=0; i<num; i++) {
            System.out.println(str);
        }
        System.out.println();
    }
}
