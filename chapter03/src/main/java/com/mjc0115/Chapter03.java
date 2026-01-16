package com.mjc0115;

public class Chapter03 {
    public void Third01() {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);

        int e = 10;
        int f = 10;
        int g;

        e++;
        ++e;
        System.out.println("e= " + e);
        System.out.println("------------");
        f--;
        --f;
        System.out.println("f= " + f);

        System.out.println("------------");
        g = e++;
        System.out.println("g= " + g);
        System.out.println("e= " + e);

        System.out.println("------------");
        g = ++e;
        System.out.println("g= " + g);
        System.out.println("e= " + e);

        System.out.println("------------");
        g = ++e + f++;
        System.out.println("g= " + g);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
    }

    public void Third02() {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        long result2 = v1 + v2 - v4;
        double result3 = (double) v1 / v2;
        int result4 = v1 % v2;
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);

        byte var1 = 125;
        for(int i=0; i<5; i++) {
            var1++;
            System.out.println("val1: " + var1);
        }
        System.out.println("----------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }
    }

    public void Third03() {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);

        int banana = 1;
        int totalPieces = banana * 10;
        int number2 = 7;

        int result2 = totalPieces - number2;
        System.out.println("10조각에서 남은 조각: " + result2);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);

    }
}
