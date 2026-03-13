package com.mjc_0313.Report2;

public class Report2_main {
    public static void main(String[] args) {
        System.out.println("=================개인과제 2================");
        Report2 report2 = new Report2();
        report2.start();

        for (int i = 2; i < 5; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }

}
