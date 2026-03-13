package com.mjc_0312.test14_6;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();

        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
