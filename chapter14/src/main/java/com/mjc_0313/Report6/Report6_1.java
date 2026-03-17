package com.mjc_0313.Report6;

import java.util.Scanner;

public class Report6_1 extends Thread {
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        for(int i=num; i<10; i++) {
//            System.out.println(num + " * " + i + " = " + num*i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//        }

    private int num;

    public Report6_1(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = num; i < 10; i++) {
                    System.out.println(num + " * " + i + " = " + num * i);
                }
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("종료");
                break;
            }
        }
    }
}
