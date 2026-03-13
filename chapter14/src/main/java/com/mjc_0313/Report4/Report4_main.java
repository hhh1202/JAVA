package com.mjc_0313.Report4;

import java.util.Scanner;

public class Report4_main {
    public static void main(String[] args) {
        Report4_1 report4_1 = new Report4_1();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(a);

        while (true) {
            System.out.println(a);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
            String b = scanner.nextLine();
            report4_1.start();
        }
    }
}
