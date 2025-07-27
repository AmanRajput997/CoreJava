package com.ok.javainonevedio.multithreading;

public class SumCalculator implements Runnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(int i = 1; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
