package com.company.operatorler;

public class ArtirmaAzaltma {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = ++sayi1;//sayi2=11; sayi1=11
        int sayi3 = sayi1--;//sayi3=11; sayi1=10

        System.out.println("Sonuc : "+(sayi1)+" "+(--sayi2)+" "+(sayi3++));
    }
}
