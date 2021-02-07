package com.company.operatorler;

public class OdevCozumleri {

    public static void main(String[] args) {
        //Cozum1
        int saniye = 1200;
        int dakika = saniye / 60;
        int kalanSaniye = saniye % 60;

        System.out.println("Girdiginiz "+ saniye+ " saniye= "+dakika+ " dakika ve "+kalanSaniye+" saniyeye esittir");
        System.out.println("**********************************");

        //Cozum 2
        //celcius = (5/9) * (fahrenheit -32)
        double fahrenheit = 100.0d;
        double celcuis =  (5.0/9.0) * (fahrenheit - 32);
        System.out.println("Girilen "+ fahrenheit + " fahrenheit = "+celcuis+ " celcius");
        System.out.println("**********************************");

        //Cözüm 3
        int yil = 4000;
        boolean artikYilMi = (yil%400 == 0) || (yil%4 == 0 && yil%100 != 0);
        System.out.println("Girilen "+ yil + " yili artik yildir: "+ artikYilMi);

    }
}
