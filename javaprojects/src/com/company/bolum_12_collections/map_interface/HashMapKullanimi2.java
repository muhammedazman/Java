package com.company.bolum_12_collections.map_interface;

import java.util.HashMap;
import java.util.Objects;

public class HashMapKullanimi2 {

    public static void main(String[] args) {

        String st1 = "emre";
        String st2 = "hasan";
        String st3 = "emre";

        // st1.hasCode() = st3.hasCode()
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());

        Ogrenci ogr1 = new Ogrenci(1, "emre");
        System.out.println(ogr1.hashCode());

        // hashCode ayni sonucu veriyor
        //ogr1.i = 2;
        //ogr1.isim = "emre";
        System.out.println(ogr1.hashCode());

        // ogr1 <> ogr2 (hashCode)
        Ogrenci ogr2 = new Ogrenci(1, "emre");
        System.out.println(ogr2.hashCode());

        // equals=false
        // override isleminden sonra true olacaktir
        System.out.println(ogr1.equals(ogr2));
        System.out.println(ogr1.hashCode());
        System.out.println(ogr2.hashCode());

        HashMap<String, Integer> isimler = new HashMap<>();
        isimler.put("emre", 1);
        isimler.put("hasan", 2);
    }
}

class Ogrenci {
    int i;
    String isim;

    public Ogrenci(int i, String isim) {
        this.i = i;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return i == ogrenci.i && Objects.equals(isim, ogrenci.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, isim);
    }
}
