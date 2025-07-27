package com.ok.javainonevedio.multithreading;

public class withMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();
        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time taken : " + (System.currentTimeMillis() - startTime) + "ms");

    }
}
