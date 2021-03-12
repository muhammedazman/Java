package com.company.bolum_16_threads;

public class SynchronizationKavrami {

    public static void main(String[] args) {
        // ayni kaynagi bir den fazla kullanimi organize etmesi icin kullaniriz
        // yazici ornegi: bir yazicidan ayni anda 10 farkli kisi cikti almak isterse
        Yazici yazici = new Yazici(10);
        Thread ayse = new Ayse(yazici);
        Thread fatma = new Fatma(yazici);

        ayse.start();
        fatma.start();
    }
}


class Yazici {
    private int dokumanSayisi;
    private int i = 0;

    public Yazici(int dokumanSayisi) {
        this.dokumanSayisi = dokumanSayisi;
    }

    // synchronized ile methodu kilitleriz
    // public synchronized void yazdir()
    public void yazdir() {

        // bu da method icinde kod blogunu kitleme islemi icin bunu kullaniriz
        synchronized (this) {
            for (int i = dokumanSayisi; i > 0; i--) {
                if (Thread.currentThread().getName().equals("Thread-0")) {
                    System.out.println(ThreadRenkler.Red+"Döküman No: "+i+" Thread Adi:"+ Thread.currentThread().getName());
                } else {
                    System.out.println(ThreadRenkler.Green+"Döküman No: "+i+" Thread Adi:"+ Thread.currentThread().getName());
                }
            }
        }

    }
}

class Ayse extends Thread {
    private Yazici yazici;

    public Ayse(Yazici yazici) {
        this.yazici = yazici;
    }

    @Override
    public void run() {
        yazici.yazdir();
    }
}

class Fatma extends Thread {
    private Yazici yazici;

    public Fatma(Yazici yazici) {
        this.yazici = yazici;
    }

    @Override
    public void run() {
        yazici.yazdir();
    }
}