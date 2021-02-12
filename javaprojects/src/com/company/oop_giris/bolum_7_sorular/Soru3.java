package com.company.oop_giris.bolum_7_sorular;

public class Soru3 {

    public static void main(String[] args) {
        System.out.println("Toplam : " + HesapMakinesi.toplam(10,12,14));
        System.out.println("Fark : " + HesapMakinesi.cikar(10,12,14));
        System.out.println("Carpim : " + HesapMakinesi.carpma(10,12,14));
        if (HesapMakinesi.bolme(40,5,2) != -1) {
            System.out.println("Bolum : " + HesapMakinesi.bolme(40,5,2));
        } else {
            System.out.println("bölme islemi basarisiz");
        }
    }
}

class HesapMakinesi{
    public static int toplam(int... parametreler){
        int toplam = 0;
        for (int param:parametreler) {
            toplam+=param;
        }
        return toplam;
    }

    public static int cikar(int... parametreler){
        int fark = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            fark = fark - parametreler[0];
        }
        return fark;
    }

    public static int carpma(int... parametreler){
        int carpim = 1;
        for (int param:parametreler) {
            carpim *= param;
        }
        return carpim;
    }

    public static double bolme(int... parametreler){
        int bolum = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            if (parametreler[i]!=0){
                bolum = bolum / parametreler[i];
            } else {
                System.out.println("parametrelerden biri 0 a bölünmez");
                return -1;
            }
        }
        return bolum;
    }
}
