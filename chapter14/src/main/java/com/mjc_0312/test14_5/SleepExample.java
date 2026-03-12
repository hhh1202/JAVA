package com.mjc_0312.test14_5;

import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            System.out.println("띵");
            try {
                Thread.sleep(1000); //1초주기
            } catch (InterruptedException e) {
            }
        }
    }
}
