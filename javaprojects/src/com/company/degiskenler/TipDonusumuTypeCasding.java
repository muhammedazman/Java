package com.company.degiskenler;

public class TipDonusumuTypeCasding {
    public static void main(String[] args) {
        int sayi = 10;
        double noktaliSayi = 25.25;
        float floatSayi = 130.25F;

        noktaliSayi = sayi;
        System.out.println("Noktali Sayi: "+noktaliSayi);

        sayi = (int) floatSayi;
        System.out.println("floattan cascade yapilmis int: "+ sayi);//130.25 => 130 virgulu siler

        byte byteSayi = (byte) floatSayi;
        System.out.println("floattan cascade edilen Byte deger: "+byteSayi);//-126 gibi hatali bir sayi ekrana yazdiracaktir.

    }
}
