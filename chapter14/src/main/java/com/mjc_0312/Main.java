package com.mjc_0312;

import com.mjc_0313.Report2;
import com.mjc_0313.Test2_1;
import com.mjc_0313.Test2_2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

        System.out.println("=================개인과제 3================");
        Test2_1 test2_1 = new Test2_1();
        test2_1.start();

        Test2_2 test2_2 = new Test2_2();
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