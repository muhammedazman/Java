package com.company.bolum_8_azkodcokis;

public class StringMetotlari {

    public static void main(String[] args) {
        String isim = "muhammed";

        System.out.println(isim.length());//karakter boyutunu döndürür
        System.out.println(isim.charAt(2));//girilen index teki karakter degerini döndürür

        String yeni = isim.concat(" azman");
        System.out.println(yeni);//muhammed azman
        //isim ile concat metodundaki datayi birlestirir.
        //ama isim degiskenin degeri degismez

        System.out.println(yeni.toLowerCase());//karakterleri büyük yapar
        System.out.println(yeni.toUpperCase());//karakterileri kücük yapar

        System.out.println(yeni.trim());//bastaki ve sondaki bosluklari siler

        String ay1 = "Mart";
        String ay2 = "mart";

        System.out.println(ay1.equals(ay2));//false
        System.out.println(ay1.equalsIgnoreCase(ay2));//true büyük kücük harf olayini dikkate almadan esitmi diye bakma

        System.out.println(ay1.compareTo(ay2));//iki deger birbirine esitse 0, alfabetik olarak onde ise - deger döndürür

        System.out.println(ay1.startsWith("A"));// A ile baslayip baslamadigini döndürür
        System.out.println(ay1.endsWith("B"));//B ile mi bitiyor

        System.out.println(ay1.contains("ar"));//ay degiskenin icinde ar kelimesi var mi diye bakar

        System.out.println(yeni.substring(5));//5.indexten baslayarak geri kalani ekrana yazdirir.
        //ama basta boslu varsa bosluklari da sayar.bu yüzden trim metodu kullanilip daha sonra bunu kullanmak
        //daha saglikli olur
        System.out.println(yeni.trim().substring(0,5));//0dan 5inci indexe kadar olan datayi getir

        System.out.println(yeni.trim().indexOf("m"));//h harfinin ilk gectigi indexi verir
        System.out.println(yeni.trim().lastIndexOf("m"));//h harfinin son gectigi indexi verir

        System.out.println("Muhammed"+" "+5+"azman"+5+6+(5+6));//parantez icine matematiksel islemi yapar

        int sayi = 5;
        int sayi2 = 6;

        System.out.println(sayi+sayi2);

        String say = "56";
        System.out.println(say+sayi);//metin + int = metin
        System.out.println(Integer.parseInt(say)+sayi);//int + int = int


    }
}
