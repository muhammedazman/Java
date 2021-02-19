package com.company.bolum_10_abstractinterface;

import java.util.Arrays;

public class ComparableKullanimi {

    public static void main(String[] args) {
        Ogr ogr1  = new Ogr(5, "emre");
        Ogr ogr2  = new Ogr(3, "hasan");
        Ogr ogr3  = new Ogr(7, "ayse");

        Ogr[] ogrenciler = {ogr1, ogr2, ogr3};
        String[] isimler = {"ayse", "fatma", "hayriye", "aliye"};
        Arrays.sort(isimler);
        for (String isim:isimler) {
            System.out.println(isim);
        }

        System.out.println("Dizi siranlanmadan onceki hali:");
        for (Ogr ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

        Arrays.sort(ogrenciler);

        System.out.println("Dizi siranlanmasindan sonraki hali:");
        for (Ogr ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}


class Ogr implements Comparable<Ogr>{

    int id;
    String ad;

    public Ogr(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Ogr{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ogr o) {
        //id ye göre kücükten büyüge gore siralama
        /*
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return 0;
        }

         */

        if(this.ad.compareTo(o.ad) < 0) {
            return -1;
        } else if (this.ad.compareTo(o.ad) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}