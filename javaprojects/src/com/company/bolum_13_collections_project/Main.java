package com.company.bolum_13_collections_project;

import com.company.bolum_13_collections_project.udemykursplayer.Ders;
import com.company.bolum_13_collections_project.udemykursplayer.Egitmen;
import com.company.bolum_13_collections_project.udemykursplayer.Kurs;
import com.company.bolum_13_collections_project.udemykursplayer.Ogrenci;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Ali", "Ali nin tanitim yazisi", "ali_udemy");
        Egitmen egitmenMuhammed = new Egitmen("muhammed", "muhammed java", "muhamed_udemy");
        Egitmen egitmenDeneme = new Egitmen("deneme", "deneme java", "deneme_udemy");
        System.out.println(ogr1);
        System.out.println(egitmenMuhammed);

        Ders d1 = new Ders(1, "Giris", 3.5);
        Ders d2 = new Ders(2, "Java nedir", 9.2);
        Ders d3 = new Ders(3, "Primitive Veri Tipleri", 22.9);
        Ders d4 = new Ders(4, "Diziler", 15.9);
        Ders d5 = new Ders(5, "Metotlar", 25);

        Ders d6 = new Ders(6, "Nesneler", 15.9);
        Ders d7 = new Ders(7, "try catsch", 17);
        Ders d8 = new Ders(8, "RecyclerView", 16.3);
        Ders d9 = new Ders(9, "Sharedprefences", 21);
        Ders d10 = new Ders(10, "Firebase", 13.9);

        Kurs javaKursu = new Kurs("Ileri Seviye Java Kursu", egitmenMuhammed);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);
        javaKursu.kursaEgitmenEkle(egitmenDeneme);
        javaKursu.kursaEgitmenSil(egitmenMuhammed);
        javaKursu.kursaEgitmenSil(egitmenDeneme);

        Kurs androidKursu = new Kurs("Android Kursu", egitmenMuhammed);
        androidKursu.kursaDersEkle(d6);
        androidKursu.kursaDersEkle(d7);
        androidKursu.kursaDersEkle(d8);
        androidKursu.kursaDersEkle(d9);
        androidKursu.kursaDersEkle(d10);

        ogr1.kursaKatil(javaKursu);
        ogr1.kursaKatil(androidKursu);
        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d7);
        ogr1.izlenecekDersEkle(d8);
        ogr1.izlenecekDersEkle(d9);

        listeyiOynat(ogr1.getIzlenecekDersListesi());
    }

    public static void listeyiOynat(LinkedList<Ders> izlenecekDersler){
        Scanner scan = new Scanner(System.in);
        boolean cikis = false;
        boolean ileriDogruHareket = false;

        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println("Henüz bir ders eklenilmemis");
        } else {
            Ders ilkDers = iterator.next();
            System.out.println("su an izlenen ders: "+ilkDers.getDersBaslik()+ " "+ilkDers.getDakika());
        }

        menuGoster();
        // cikis false oldugu müddetce while calisacak
        while (!cikis){
            System.out.println("Seciminiz:");
            int kullaniciSecimi = scan.nextInt();
            switch (kullaniciSecimi){
                case 0:
                    System.out.println("Uygulamadan cikiliyor");
                    cikis = true;
                    break;
                case 1:
                    if (!ileriDogruHareket){
                        ileriDogruHareket=true;

                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }

                    if (iterator.hasNext()) {
                        Ders ilkDers = iterator.next();
                        System.out.println("======================================================================================");
                        System.out.println("SU AN OYNATILAN:"+ ilkDers.getDersNo()+" der nolu "+ilkDers.getDersBaslik()+ " isimli "+ilkDers.getDakika());
                        System.out.println("======================================================================================");
                        ileriDogruHareket=true;
                    } else {
                        System.out.println("LISTENIN BASINA GELDINIZ. ILERI GIDEMEZSINIZ");
                    }
                    break;
                case 2:
                    if (ileriDogruHareket){
                        ileriDogruHareket=false;

                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }

                    if (iterator.hasPrevious()) {
                        Ders ilkDers = iterator.previous();
                        System.out.println("======================================================================================");
                        System.out.println("SU AN OYNATILAN:"+ ilkDers.getDersNo()+" der nolu "+ilkDers.getDersBaslik()+ " isimli "+ilkDers.getDakika());
                        System.out.println("======================================================================================");
                        ileriDogruHareket=false;
                    } else {
                        System.out.println("LISTENIN SONUNA GELDINIZ. GERI GIDEMEZSINIZ");
                    }
                    break;
                case 3:
                    izlenecekDersleriListele(izlenecekDersler);
                    break;
                case 9:
                    menuGoster();
                    break;
            }
        }
    }

    private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {
        Iterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println("Henüz bir ders eklenilmemis");
            return;
        } else {
            while (iterator.hasNext()) {
                Ders ilkDers = iterator.next();
                System.out.println(ilkDers.getDersNo()+ " nolu ders: " + ilkDers.getDersBaslik() + " " + ilkDers.getDakika());
            }
        }
    }

    private static void menuGoster() {
        System.out.println("****************** MENU ******************");
        System.out.println("0- Cikis");
        System.out.println("1- Bir sonraki derse git");
        System.out.println("2- Bir önceki  derse git");
        System.out.println("3- Tüm listeyi göster");
        System.out.println("9- Menü");
    }
}
