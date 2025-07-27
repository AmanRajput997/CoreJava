package com.ok.javainonevedio.multithreading;

public class NumberCounter extends Thread {
    @Override
    public void run() {
        int count = 0;
        for(int i = 1; i <= 500000000; i++) {
            if(i % 10 == 7) {
                count++;
            }
        }
        System.out.println("Count of number ending in 7 : " + count);
    }
}
