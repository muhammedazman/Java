package com.company.bolum_8_azkodcokis;

public class KalitimOrnek {

    public static void main(String[] args) {
        /*Dikdortgen dikdortgen = new Dikdortgen(10, 20);
        dikdortgen.ozellikYazdir();
        System.out.println(dikdortgen);

        GeometrikSekil geometrikSekil = new GeometrikSekil(5, 10);
        System.out.println(geometrikSekil);*/

        Kare kare = new Kare(10);
        kare.alanHesapla();
        kare.cevreHesapla();
    }
}

class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik sekil olusturuldu");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("Geometrik sekil olusturuldu");
    }

    public GeometrikSekil() {
        System.out.println("Geometrik sekil olusturuldu");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Alan: "+(en * boy));
    }

    public void cevreHesapla() {
        System.out.println("Cevre: "+ 2 * (en + boy));
    }

    @Override
    public String toString() {
        return "Geometrik Sekil En: " + getEn() + " Boy: " + getBoy();
    }
}

class Dikdortgen extends GeometrikSekil{

    public Dikdortgen(int en, int boy) {
        super(en, boy);
        System.out.println("Dikdortgen olusturuldu");
    }

    public Dikdortgen(int en) {
        super(en);
        System.out.println("Dikdortgen olusturuldu");
    }

    public void ozellikYazdir() {
        System.out.println("Geometrik seklin eni: " + getEn() + " boyu: "+ getBoy());
        alanHesapla();
        cevreHesapla();
    }

    @Override
    public String toString() {
        return "Dikdörtgenin En: "+getEn() + " Boy: "+getBoy();
    }
}

class Kare extends Dikdortgen{

    public Kare(int en) {
        super(en);
        setBoy(en);
        System.out.println("Kare olusturuldu");
    }
}
