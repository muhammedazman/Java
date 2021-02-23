package com.company.bolum_11_generics;

import java.util.ArrayList;

public class GenericsKavrami {

    //generic primativ tipler ile calisamiyor
    //int Integer
    //char Character
    public static void main(String[] args) {
        String[] isimler = {"emre", "ayse", "ali"};
        Integer[] sayilar = {1,5,7,9,10};
        Character[] karakterler = {'a', 'b', 'k'};

        System.out.println("KLASIK METOT");
        StringDiziYazdir.yazdir(isimler);
        IntegerDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);

        System.out.println("GENERICS");

        GenericDiziYazdir<String> stringGenericDiziYazdir = new GenericDiziYazdir<>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> intergerGenericDiziYazdir = new GenericDiziYazdir<>();
        intergerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> characterGenericDiziYazdir = new GenericDiziYazdir<>();
        characterGenericDiziYazdir.yazdir(karakterler);

        ArrayList<String> listem = new ArrayList();
        listem.add("ankara");
        listem.add("bursa");
        //listem.add(1);
        //listem.add(true);
        //listem.add(5.4);
        listem.add("izmir");


        for (Object gecici:listem) {
            System.out.println(gecici);
        }
    }
}
