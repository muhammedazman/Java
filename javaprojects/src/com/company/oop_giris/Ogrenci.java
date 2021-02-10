package com.company.oop_giris;

public class Ogrenci {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    public Ogrenci() {

    }

    public Ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci (int ogrenciNo, String isim) {
        //this.ogrenciNo = ogrenciNo;
        this(ogrenciNo); //Ogrenci(ogrenciNo) fonksiyonunu cagiriyoru
        this.isim = isim;
    }

    public Ogrenci (int ogrenciNo, String isim, byte sinif) {
        //this.ogrenciNo = ogrenciNo;
        //this.isim = isim;
        this(ogrenciNo,isim);
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        //this.ogrenciNo = ogrenciNo;
        //this.isim = isim;
        //this.sinif = sinif;
        this(ogrenciNo, isim, sinif);
        this.aktif = aktif;
    }

    public void ogrenciBilgileriniYazdir() {
       if (aktif)
           System.out.println("Adim: " + isim + " numaram: " + ogrenciNo + " sinifim: " + sinif);
       else
           System.out.println("Bu ögrenci aktif degil");
    }
}
