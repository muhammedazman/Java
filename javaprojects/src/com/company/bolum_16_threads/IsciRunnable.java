package com.company.bolum_16_threads;

public class IsciRunnable implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("isci-runnable sinifi calismaya basladi: "+ Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("isci-runnable sinifi tamamlandi: "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
