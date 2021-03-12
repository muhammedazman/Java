package com.company.bolum_16_threads;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program baslatildi " + Thread.currentThread().getName());

        Isci isci = new Isci();
        isci.setName("ISCI SINIFI THREADI");
        isci.start();

        IsciRunnable isciRunnable = new IsciRunnable();
        Thread isciThread = new Thread(isciRunnable);
        isciThread.setName("ISCI RUNNABLE");
        isciThread.start();

        System.out.println("Program bitti...");
    }
}
