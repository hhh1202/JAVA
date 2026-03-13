package com.mjc_0313.Report2;

public class Report2 extends Thread {
    @Override
    public void run() {
        for (int i = 5; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                try{
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }
}
