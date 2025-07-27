package com.ok.javainonevedio.multithreading;

public class withoutMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(int i = 1; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int count = 0;
        for(int i = 1; i <= 500000000; i++) {
            if(i % 10 == 7) {
                count++;
            }
        }
        System.out.println("Count of number ending in 7 : " + count);
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
