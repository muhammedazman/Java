package com.company.operatorler;

public class IliskiselMantiksalKarsilastirmaOperator {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 11;

        System.out.println("Sayi 1 esit mi Sayi2: "+ (sayi1==sayi2));
        System.out.println("Sayi 1 kucuk mi Sayi2: "+ (sayi1<sayi2));
        System.out.println("Sayi 1 buyuk mi Sayi2: "+ (sayi1>sayi2));
        System.out.println("Sayi 1 kucuk esit mi Sayi2: "+ (sayi1<=sayi2));
        System.out.println("Sayi 1 buyuk esit mi Sayi2: "+ (sayi1>=sayi2));
        System.out.println("Sayi 1 esit degil mi Sayi2: "+ (sayi1!=sayi2));
    }
}
