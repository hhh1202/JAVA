package com.mjc_0312.test14_3;

import java.awt.Toolkit;

public class BeepPrintExample {
//    public static void main(String[] args) {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for (int i = 0; i < 5; i++) {
//            toolkit.beep();
//            try {
//                Thread.sleep(500);
//            } catch (Exception e) {
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("띵");
//            try{ Thread.sleep(500); } catch(Exception e) {}
//        }
//    }

//    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for(int i=0; i<5; i++) {
//                    toolkit.beep();
//                    try { Thread.sleep(500); } catch(Exception e) {}
//                }
//            }
//        });
//
//        thread.start();
//        for(int i=0; i<5; i++) {
//            System.out.println("띵");
//            try { Thread.sleep(500); } catch(Exception e) {}
//        }
//    }

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try { Thread.sleep(500); } catch(Exception e) {}
                }
            }
        };

        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}