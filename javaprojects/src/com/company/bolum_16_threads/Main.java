package com.company.bolum_16_threads;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program baslatildi " + Thread.currentThread().getName());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program bitti...");
    }
}
