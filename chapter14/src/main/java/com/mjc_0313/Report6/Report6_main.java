package com.mjc_0313.Report6;

import java.util.Scanner;

public class Report6_main {
    public static void main(String[] args) {
//        Report6_1 report6_1 = new Report6_1();
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        for (int i = num; i < 10; i++) {
//            System.out.println(num + " * " + i + " = " + num * i);
//            try {x
//                Thread.sleep(1000);
//                report6_1.start();
//            } catch (Exception e) {
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        Thread th = null;

        while (true) {
            int num = scanner.nextInt();
            for (int i = num; i < 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
                if (th != null) {
                    th.interrupt();
                }
                th = new Thread(new Report6_1(num));
                th.start();
            }
        }
    }
}
