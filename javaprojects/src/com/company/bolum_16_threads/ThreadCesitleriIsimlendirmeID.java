package com.company.bolum_16_threads;

public class ThreadCesitleriIsimlendirmeID {

    public static void main(String[] args) {
        Thread mainCurrentThread = Thread.currentThread();
        System.out.println("thread adi: "+ mainCurrentThread.getId());
        mainCurrentThread.setName("YENI MAIN THREADI");
        System.out.println("main thread adi: "+ mainCurrentThread.getName());

        MyThread t1 = new MyThread("USER THREAD", ThreadRenkler.Green, 1);
        System.out.println("t1 thread türü deamon mu? : "+t1.isDaemon());
        System.out.println("t1 thread ID: "+ t1.getId());
        t1.start();// bir thread sadece bir kere kullanilabilir

        MyThread t2 = new MyThread("DAEMON THREAD", ThreadRenkler.Red, 2);
        t2.setDaemon(true);// programin sonlanmasi icin threatin bitmesini beklemeye gerek yoktur
        System.out.println("t2 thread türü deamon mu? : "+t2.isDaemon());
        System.out.println("t2 thread ID: "+ t2.getId());
        t2.start();
    }
}

class MyThread extends Thread {

    private final String renk;
    private final int uykuSaniyesi;

    @Override
    public long getId() {
        return super.getId() + 85;
    }

    public MyThread(String name, String renk, int uykuSaniyesi) {
        super(name);
        this.renk = renk;
        this.uykuSaniyesi = uykuSaniyesi;
    }

    @Override
    public void run() {
        System.out.println(renk + "Ben "+uykuSaniyesi+" saniyelik uzun suren islemi baslatiyorum. Thread Adi: "+ Thread.currentThread().getName());

        try {
            Thread.sleep(uykuSaniyesi * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(renk + "Ben "+uykuSaniyesi+" saniyelik uzun suren islemi bittirdim. Thread Adi: "+ Thread.currentThread().getName());
    }
}