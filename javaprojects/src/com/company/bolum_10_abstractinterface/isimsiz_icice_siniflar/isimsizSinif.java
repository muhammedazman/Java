package com.company.bolum_10_abstractinterface.isimsiz_icice_siniflar;

public class isimsizSinif {

    public static void main(String[] args) {

        Hesaplayici hesaplayici1 = new Hesaplayici(){
            @Override
            public void topla(int s1, int s2) {
                System.out.println("Iki sayinin toplami");
                super.topla(s1, s2);
            }
        };

        hesaplayici1.topla(7, 8);


        Hesaplayici hesaplayici = new Hesaplayici();
        hesaplayici.topla(5 ,6);

        /*
        YeniHesaplayici yeniHesaplayici = new YeniHesaplayici();
        yeniHesaplayici.topla(11,7);

         */

        Canli canli = new Canli() {
            @Override
            void adiniSoyle() {
                System.out.println("ben isimsiz siniftaki adini soyle sinifiyim");
            }

            @Override
            void selamVer() {
                System.out.println("ben isimsiz siniftaki selm ver sinifiyim");
            }
        };

        Gecici gecici = new Gecici();
        gecici.adiniSoyle();
        gecici.selamVer();

        Yazdir yazdir = new Yazdir() {
            @Override
            public void yazdir() {
                System.out.println("Anonim ic sinif yazdir metotu");
            }
        };

        yazdir.yazdir();

    }
}

interface Yazdir{
    void yazdir();
}

class FakeSinif implements Yazdir{

    @Override
    public void yazdir() {

    }
}

class Gecici extends Canli{

    @Override
    void adiniSoyle() {
        System.out.println("ben gcici siniftaki adini soyle sinifiyim");
    }

    @Override
    void selamVer() {
        System.out.println("ben gcici siniftaki selam ver sinifiyim");
    }
}

abstract class Canli {

    abstract void adiniSoyle();
    void selamVer(){
        System.out.println("Merhaba");
    }
}

class YeniHesaplayici extends Hesaplayici{

    @Override
    public void topla(int s1, int s2) {
        System.out.println("Iki sayinin toplami");
        super.topla(s1, s2);
    }
}
