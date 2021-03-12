package com.company.bolum_16_threads;

public class Isci extends Thread{

    @Override
    public void run() {
        super.run();

        try {
            System.out.println("isci sinifi calismaya basladi: "+ Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("isci sinifi tamamlandi: "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
