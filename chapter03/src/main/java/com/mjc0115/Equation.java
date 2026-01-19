package com.mjc0115;

public class Equation {
    public int EquationFirst(int a, int b) {
        return -b / a;
    }

    public void test1() {
        int x = 10, y = 20, z = (++x) + (y--);
        System.out.println(z);
    }

    public void test2() {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        System.out.println(result);
    }

    public void test3() {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);
    }

    public void test4() {
        int value = 356;
        System.out.println((value / 100) * 100);
    }

    public void test5() {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double)(lengthTop + lengthBottom) * height / 2;
    }

    public void test6() {
        int x = 10, y = 5;
        System.out.println((x>7) && (y<=5));
        System.out.println((x%3 == 2) || (y%2 != 1));
    }

    public void test7() {
        double x = 5.0, y = 0.0, z = 5 % y;
        if( Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과" + result);
        }
    }
}
