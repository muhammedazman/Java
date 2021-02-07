package com.company.operatorler;

public class AritmetikOperatorler {

    public static void main(String[] args) {
        int sayi1 = 60;
        int sayi2 = 40;

        System.out.println("Sayi 1:" + sayi1+ " Sayi 2:"+ sayi2 + " Toplami :"+ (sayi1+sayi2));
        System.out.println("Sayi 1:" + sayi1+ " Sayi 2:"+ sayi2 + " Farki :"+ (sayi1-sayi2));
        System.out.println("Sayi 1:" + sayi1+ " Sayi 2:"+ sayi2 + " Carpimi :"+ (sayi1*sayi2));
        System.out.println("Sayi 1:" + sayi1+ " Sayi 2:"+ sayi2 + " Bölümü :"+ ((double)sayi1/sayi2));//double yapmazsak virgulden sonrasini siler
        System.out.println("Sayi 1:" + sayi1+ " Sayi 2:"+ sayi2 + " Kalan :"+ (sayi1%sayi2));
    }
}
