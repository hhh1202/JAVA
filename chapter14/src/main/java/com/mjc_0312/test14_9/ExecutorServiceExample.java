package com.mjc_0312.test14_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.shutdownNow();
    }
}
