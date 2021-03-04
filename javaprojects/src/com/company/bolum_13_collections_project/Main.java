package com.company.bolum_13_collections_project;

import com.company.bolum_13_collections_project.udemykursplayer.Ders;
import com.company.bolum_13_collections_project.udemykursplayer.Egitmen;
import com.company.bolum_13_collections_project.udemykursplayer.Kurs;
import com.company.bolum_13_collections_project.udemykursplayer.Ogrenci;

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
        Ders d5 = new Ders(4, "Metotlar", 25);

        Kurs javaKursu = new Kurs("Ileri Seviye Java Kursu", egitmenMuhammed);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);
        javaKursu.kursaEgitmenEkle(egitmenDeneme);
        javaKursu.kursaEgitmenSil(egitmenMuhammed);
        javaKursu.kursaEgitmenSil(egitmenDeneme);

        ogr1.kursaKatil(javaKursu);
    }
}
