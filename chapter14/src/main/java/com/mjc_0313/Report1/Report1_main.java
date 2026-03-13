package com.mjc_0313.Report1;

public class Report1_main {
    public static void main(String[] args) {
        System.out.println("=================개인과제 1================");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
}
