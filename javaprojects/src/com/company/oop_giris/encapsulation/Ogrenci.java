package com.company.oop_giris.encapsulation;

public class Ogrenci {

    private int ogrenciNo;
    private String isim;
    private int sinif;
    private boolean aktif;

    //Encapsulation: getter setter
    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return this.ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public Ogrenci() {

    }

    public Ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(int ogrenciNo, String isim) {
        this(ogrenciNo); //Ogrenci(ogrenciNo) fonksiyonunu cagiriyoru
        this.isim = isim;
    }

    public Ogrenci(int ogrenciNo, String isim, int sinif) {
        this(ogrenciNo,isim);
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo, String isim, int sinif, boolean aktif) {
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
