package com.company.bolum_9_sorular;

import java.util.Scanner;

public class Soru2 {

    static Scanner tara = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();

        boolean cikis = false;

        while (cikis == false){
            System.out.println("Seciminiz: (menüyü görmek icin 8 i tuslainiz)");

            int secim = tara.nextInt();

            switch (secim){
                case 1:
                    tvKurveKanallariOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();;
                    break;
                case 0:
                    System.out.println("Sistemden cikiliyor");
                    cikis=true;
                    break;
                default:
                    System.out.println("0 ile 8 arasinda bir deger giriniz");
                    break;
            }
        }
    }

    private static void kanalBilgisiniGoster() {
        if(tv != null){
            tv.aktifKanaliGoster();
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void kanalDegistir() {
        if(tv != null){
            System.out.println("Kanal degerini giriniz");
            for (Kanal k:tv.getKanallar()) {
                System.out.println(k.getKanalNo() + " " + k.getAdi());
            }
            int kanal = tara.nextInt();
            tv.kanalDegistir(kanal);
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void sesAzalt() {
        if(tv != null){
            tv.sesAzalt();
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void sesArttir() {
        if(tv != null){
            tv.sesArttir();
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void tvKapat(){
        if(tv != null){
            tv.tvKapat();
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void tvAc(){
        if(tv != null){
            tv.tvAc();
        } else {
            System.out.println("Once tv yi kurun ve kanallari olusturun");
        }
    }

    private static void tvKurveKanallariOlustur() {

        if (tv == null) {
            tara.nextLine();
            System.out.println("Televizyonun markasini giriniz");
            String marka = tara.nextLine();
            System.out.println("Televizyonun boyutunu giriniz");
            String boyut = tara.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("************** MENU *************");
        System.out.println("0 -- Cikis\n" +
                "1 -- Televizyonu Kur\n" +
                "2 -- Televizyonu Ac\n" +
                "3 -- Sesini Arttir\n" +
                "4 -- Sesi Azalt\n" +
                "5 -- Kanali Degistir\n" +
                "6 -- Kanal Bilgisini Goster\n" +
                "7 -- Televizyonu Kapat\n" +
                "8 -- Menüyü Göster");
    }
}
