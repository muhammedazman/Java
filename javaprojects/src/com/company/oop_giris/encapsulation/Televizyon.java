package com.company.oop_giris.encapsulation;

public class Televizyon {

    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        if(acik && kanal>0 && kanal<500) {
            this.kanal = kanal;
        } else {
            System.out.println("tv kapali veya yanlis bir deger girdiniz!");
            kanal=1;
        }
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if(acik && sesSeviyesi>0 && sesSeviyesi<20) {
            this.sesSeviyesi = sesSeviyesi;
        } else {
            sesSeviyesi=1;
        }
    }

    public  void ac(){
        if(acik==false) {
            System.out.println("Televizyon aciliyor");
            acik = true;
        } else {
            System.out.println("Tv zaten acik");
        }
    }

    public void kapat() {
        if(acik==true) {
            System.out.println("Televizyon kapaniyor");
            acik = false;
        } else {
            System.out.println("Tv zaten kapali");
        }
    }

    public void goster(){
        System.out.println("Tv acik: "+acik+" ses seviyesi "+sesSeviyesi+" kanal "+kanal);
    }
}
