package com.mjc_0304.lambda;

public class ClassString implements MyString {
    public void procString(String str, int num) {
        int lengthStr = str.length();
        if( lengthStr == num ) {
            System.out.println("str의 길이와, num 숫자는 같습니다.");
        } else {
            System.out.println("str의 길이와, num 숫자는 다릅니다.");
        }
    }
}
