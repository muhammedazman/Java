package com.company.bolum_8_azkodcokis;

import java.util.Objects;

public class EqualsKullanimi {

    public static void main(String[] args) {
        Kisi kisi1 = new Kisi(5, "emre");
        System.out.println(kisi1);

        Kisi kisi2 = new Kisi(5, "emre");
        System.out.println(kisi2);

        System.out.println("kisi1 ve kisi2 nesneleri birbirlerine esit mi: " + kisi1.equals(kisi2));//true

        kisi1 = kisi2;
        Calisan calisan = new Calisan(5,"emre");
        System.out.println("kisi1 ve calisan nesneleri birbirlerine esit mi: " + kisi1.equals(calisan));//false

        System.out.println("kisi1 in hashcodu: "+kisi1.hashCode());
        System.out.println("kisi2 in hashcodu: "+kisi2.hashCode());

        String isim1 = new String("emre");
        String isim2 = new String("emre");
        System.out.println("isimler esit mi: "+isim1.equals(isim2));//true

        Integer sayi1 = new Integer(1);
        Integer sayi2 = new Integer(1);
        System.out.println("sayilar esit mi: "+sayi1.equals(sayi2));//true

    }
}

class Kisi{

    int id;
    String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    public boolean equals(Kisi o) {
        if (this == o) return true;
        return id == o.id && isim.equals(o.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


class Calisan{
    private int id;
    private String isim;

    public Calisan(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }
}