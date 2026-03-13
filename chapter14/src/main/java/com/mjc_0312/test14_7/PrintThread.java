package com.mjc_0312.test14_7;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

//    @Override
//    public void run() {
//        while (!stop) {
//            System.out.println("실행 중");
//        }
//        System.out.println("리소스 정리");
//        System.out.println("실행 종료");
//    }
//
//    public void run() {
//        try {
//            while (true) {
//                System.out.println("실행 중");
//                Thread.sleep(1);
//            }
//        } catch (InterruptedException e){
//        }
//        System.out.println("리소스 정리");
//        System.out.println("실행 종료");
//    }

    public void run() {
            while(true) {
                System.out.println("실행 중");
                if(Thread.interrupted()) {
                    break;
                }
            }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}

