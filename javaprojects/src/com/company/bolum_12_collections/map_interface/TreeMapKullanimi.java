package com.company.bolum_12_collections.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapKullanimi {

    // elemanlari kendi belirledigim siraya gore ekrana gelmesini istiyorsam TreeMap kullaniyoruz
    public static void main(String[] args) {

        /* Örnek 1 */
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("muhammed",1);
        treeMap.put("hasan",2);
        treeMap.put("ayse",3);
        treeMap.put("ali",4);

        // a>z siralar
        System.out.println(treeMap);

        /* Örnek 2 */
        TreeMap<Kare, String> kareStringTreeMap = new TreeMap<>(new Comparator<Kare>() {
            @Override
            public int compare(Kare o1, Kare o2) {
                System.out.println("Comparator compare methodu");
                if (o1.kenar < o2.kenar) {
                    return -1;
                } else if (o1.kenar > o2.kenar) {
                    return 1;
                } else return 0;
            }
        });

        Kare k1 = new Kare(4, "mavi");
        Kare k2 = new Kare(2, "sari");
        Kare k3 = new Kare(6, "yesil");

        kareStringTreeMap.put(k1,"mavi kare");
        kareStringTreeMap.put(k2,"sayi kare");
        kareStringTreeMap.put(k3, "yesil kare");

        System.out.println(kareStringTreeMap.lowerEntry(k1));
        System.out.println(kareStringTreeMap.higherEntry(k1));

        // kendi olusturdugumuz nesneyi Java nasil siralayacagini bilmedigi icin hata alinacaktir
        System.out.println(kareStringTreeMap);
    }
}

class Kare implements Comparable<Kare>{

    int kenar;
    String renk;

    public Kare(int kenar, String renk) {
        this.kenar = kenar;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                ", renk='" + renk + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kare o) {
        System.out.println("comparablenin comperTo methodu");
        if (this.kenar < o.kenar) {
            return -1;
        } else if (this.kenar > o.kenar) {
            return 1;
        } else return 0;
    }
}