package com.company.oop_giris.bolum_7_sorular;

public class Soru1 {

    public static void main(String[] args) {
        CemberDaire cember1 = new CemberDaire(5);
        System.out.printf("Yaricapi 5 olan cemberin cevresi: %.2f ", cember1.cevreBul());
        System.out.printf("\nYaricapi 5 olan cemberin alani: %.2f ", cember1.alanBul());
    }
}

class CemberDaire {

    private int yariCap;
    public final static double PI = 3.14;//bu deger bir daha degistirilmeyecegi icin final dedik

    public CemberDaire(int r){
        this.yariCap = r;
    }

    public double cevreBul(){
        return 2 * PI * yariCap;
    }

    public double alanBul(){
        return PI * Math.pow(yariCap, 2); //yaricapin karesini verecektir
    }
}
