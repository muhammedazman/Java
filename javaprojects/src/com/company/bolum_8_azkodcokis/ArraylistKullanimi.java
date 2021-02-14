package com.company.bolum_8_azkodcokis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistKullanimi {

    public static void main(String[] args) {
        //Telefon[] telefonlar = new Telefon[20];
        List<Telefon> telefonlar = new ArrayList<Telefon>();
        Telefon tel1 = new Telefon("Mi 8", 3000);
        Telefon tel2 = new Telefon("Mate 10 Pro", 4500);
        Telefon tel3 = new Telefon("iPhone X", 7000);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);

        System.out.println(telefonlar.get(0));

        telefonlar.add(2, tel3);
        telefonlar.remove(2);

        System.out.println(telefonlar.size());

        //listeyiYazdir(telefonlar);

        telefonlar.add(1, tel2);

        System.out.println(telefonlar.contains(tel1));//arraylist tel1 i iceriyor mu

        listeyiYazdir((ArrayList<Telefon>) telefonlar);
    }

    public static void listeyiYazdir(ArrayList<Telefon> telefonlar) {
        //1.for
        for (int i = 0; i < telefonlar.size(); i++) {
            System.out.println(telefonlar.get(i));
        }

        System.out.println("*************");

        //2.for
        for (Telefon telefon:telefonlar) {
            System.out.println(telefon);
        }
    }
}

abstract class AbstractMapService<T, Telefon extends Comparable<Telefon>>{}

class Telefon{
    String model;
    int fiyat;

    public Telefon(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
