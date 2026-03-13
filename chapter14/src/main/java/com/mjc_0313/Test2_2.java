package com.mjc_0313;

public class Test2_2 implements Runnable{
    @Override
    public void run() {
        for (int i = 4; i < 7; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
        }
    }
};
