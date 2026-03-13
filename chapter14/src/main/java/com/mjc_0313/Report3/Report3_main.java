package com.mjc_0313.Report3;

public class Report3_main {
    public static void main(String[] args) {
        System.out.println("=================개인과제 3================");
        Report3_1 test2_1 = new Report3_1();
        Report3_2 test2_2 = new Report3_2();

        test2_1.start();
        test2_2.run();

        for (int i = 2; i < 4; i++) {
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
