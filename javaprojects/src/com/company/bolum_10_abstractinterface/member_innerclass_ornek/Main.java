package com.company.bolum_10_abstractinterface.member_innerclass_ornek;

public class Main {

    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        HesapMakinesi.Topla toplayici = hesapMakinesi.new Topla();
        int toplam = toplayici.topla(5,6);
        System.out.println("Toplam: " + toplam);

        HesapMakinesi.Cikar cikarici = hesapMakinesi.new Cikar();
        int fark = cikarici.cikar(9,4);
        System.out.println("Fark: " + fark);

        int carpim = hesapMakinesi.carp(6, 4);
        System.out.println("Carpim: " + carpim);

        String bolum = hesapMakinesi.bolmeYap(25, 0);
        if (!bolum.equals("")){
            System.out.println("Bölme: " + bolum);
        }
    }
}
