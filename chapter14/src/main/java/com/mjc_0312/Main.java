package com.mjc_0312;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread mainthread = new Thread() {
            public void run() {
                for (int i = 2; i < 5; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " * " + j + " = " + i * j);
                    }
                }
            }
        };
        mainthread.start();

        Thread threadA = new Thread() {
            public void run() {
                for(int i=5; i<10; i++) {
                    for(int j=1; j<10; j++) {
                        System.out.println(i + " * " + j + " = " + i*j);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e){
                            throw new RuntimeException();
                        }
                    }
                }
            }
        };
        threadA.start();
    }
}