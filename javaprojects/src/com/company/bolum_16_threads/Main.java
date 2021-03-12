package com.company.bolum_16_threads;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program baslatildi " + Thread.currentThread().getName());

        // Thread (extends)
        Isci isci = new Isci();
        isci.setName("ISCI SINIFI THREADI");
        isci.start();

        // Runnable (implemets)
        IsciRunnable isciRunnable = new IsciRunnable();
        Thread isciThread = new Thread(isciRunnable);
        isciThread.setName("ISCI RUNNABLE");
        isciThread.start();

        // anonim runnable inner class yöntemi
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runnable-innerclass sinifi calismaya basladi: "+ Thread.currentThread().getName());
                    Thread.sleep(10000);
                    System.out.println("runnable-innerclass sinifi tamamlandi: "+ Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // anonim thread inner class
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("thread-innerclass sinifi calismaya basladi: "+ Thread.currentThread().getName());
                    Thread.sleep(10000);
                    System.out.println("thread-innerclass sinifi tamamlandi: "+ Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        System.out.println("Program bitti...");
    }
}
