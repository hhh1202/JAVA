package com.mjc_0313.Report4;

import java.util.Scanner;

public class Report4_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread th = null;

        while (true) {
            String input = scanner.nextLine();
            if(th != null){
                th.interrupt();
            }
            th = new Thread(new Report4_1(input));
            th.start();
        }
    }
}
