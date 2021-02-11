package com.company.oop_giris;

public class ImmutableVeMetotaNesneGondermek {

    public static void main(String[] args) {

        String[] ureticiFirmalar = {"HP", "Fujitsu", "Dell"};
        Bilgisayar bilgisayar = new Bilgisayar(8, 16, ureticiFirmalar);
        bilgisayariYazdir(bilgisayar);

        String[] ureticiler = bilgisayar.getUreticiFirmalar();
        ureticiler[0] = "Apple";

        bilgisayariYazdir(bilgisayar);
    }

    public static void bilgisayariYazdir(Bilgisayar b) {
        System.out.println("Cekirdek Sayisi: "+b.getCekirdekSayisi()+" Ram Boyutu: "+b.getRamBoyutu() +
                " üretici firmalar "+ b.getUreticiFirmalar()[0]);
    }
}

class Bilgisayar {

    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cekirdekSayisi, int ramBoyutu, String[] ureticiFirmalar){
        this.cekirdekSayisi = cekirdekSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalar = ureticiFirmalar;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalar() {

        String[] kopyaUreticiFirmalar = new String[ureticiFirmalar.length];

        for (int i = 0; i < ureticiFirmalar.length; i++) {
            //hem adres hem de veriyi kopyalamamak icin bunu yapiyoruz.
            //Bu sekilde sadece verisini alacaz, adres ise otomatik olarak yeniden atanacak.
            kopyaUreticiFirmalar[i] = ureticiFirmalar[i];
        }
        return kopyaUreticiFirmalar;
    }
}
