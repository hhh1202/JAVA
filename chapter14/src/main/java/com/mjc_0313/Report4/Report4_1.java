package com.mjc_0313.Report4;

import java.util.Scanner;

public class Report4_1 extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        System.out.println(b);

        while(true) {
            System.out.println(b);
            try{
                Thread.sleep(300);

            } catch(Exception e) {}
        }
    }
}
