package com.company.bolum_16_threads;

public class UreticiTuketici {

    public static void main(String[] args) {
        OrtakAlan ortakAlan = new OrtakAlan();
        Uretici ureticiThread = new Uretici(ortakAlan);
        Tuketici tuketiciThread = new Tuketici(ortakAlan);

        ureticiThread.start();
        tuketiciThread.start();
    }
}

class OrtakAlan {
    private int veri;
    private boolean veriVarMi=false;

    public synchronized int veriAl(){

        while (veriVarMi == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        veriVarMi=false;
        notifyAll();
        return veri;
    }

    public synchronized void veriYaz(int v){

        while (veriVarMi == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        veriVarMi=true;
        this.veri = v;
        notifyAll();
    }
}

class Uretici extends Thread{
    private OrtakAlan ortakAlan;

    public Uretici(OrtakAlan o){
        this.ortakAlan = o;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ortakAlan.veriYaz(i);
            System.out.println(ThreadRenkler.Magenta+"Üretici thread konulan veri:"+i);
            try {
                sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Tuketici extends Thread{
    private OrtakAlan ortakAlan;

    public Tuketici(OrtakAlan o){
        this.ortakAlan = o;
    }

    @Override
    public void run() {
        int okunanDeger=0;

        for (int i = 0; i < 10; i++) {
            okunanDeger = ortakAlan.veriAl();
            System.out.println(ThreadRenkler.Blue+"Tüketici thread konulan veri:"+okunanDeger);
            try {
                sleep((int) (Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}