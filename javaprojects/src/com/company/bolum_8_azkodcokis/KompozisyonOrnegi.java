package com.company.bolum_8_azkodcokis;

public class KompozisyonOrnegi {

    public static void main(String[] args) {
        Araba myAraba = new Araba();
        myAraba.hareketeGec();
        myAraba.durmayaBasla();
    }
}

class Motor {

    private String isim;
    private int beygirGucu;

    public Motor(){
        isim = "Honda";
        beygirGucu = 135;
        System.out.println(isim + " isimli " + " beygir güclu "+ beygirGucu + " motor olusturuldu");
    }

    public void calistir() {
        System.out.println("Motor calistirildi.");
    }

    public void durdur() {
        System.out.println("Motor durdurldu.");
    }
}

class Araba {
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;

    public Araba(){
        arabaMotoru = new Motor();
        renk = "Kirmizi";
        marka = "Toyota";
        uretimYili = 2019;
        System.out.println(renk + " renkli " + uretimYili + " üretim yilli " + marka + " markali araba olusturuldu");
    }

    public void hareketeGec() {
        System.out.println("Araba harekete geciyor");
    }

    public void durmayaBasla() {
        System.out.println("Araba durmaya basladi");
    }
}
