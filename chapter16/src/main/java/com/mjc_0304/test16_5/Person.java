package com.mjc_0304.test16_5;

public class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10 , 4);
        System.out.println("결과: " + result);
    }

    public void ordering(Comparable comparable) {
        String a = "홍길동";
        String b = "김길동";

        int result = comparable.compare(a, b);

        if(result < 0) {
            System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
        } else if(result == 0) {
            System.out.println(a + "은 " + b + "과 같습니다.");
        } else {
            System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
        }
    }
}
