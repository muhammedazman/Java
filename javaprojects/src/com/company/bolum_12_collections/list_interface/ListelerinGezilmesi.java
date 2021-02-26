package com.company.bolum_12_collections.list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGezilmesi {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(5);
        sayilar2.add(6);


        System.out.println("for dongusu ile gezmek");
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }

        System.out.println("Gelismis for dongusu");
        for (Integer i:sayilar) {
            System.out.println(i);
        }

        System.out.println("sayilar ile sayilar2 de ortak olan elemanlar sayilardan cikarilsin");
        //silme islemlerinde indexi kullanacaksaniz for dongusunu kullanmayiniz
        /*for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar2.contains(sayilar.get(i))){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);*/

        System.out.println("Iterator ile listenin gezinilmesi");
        Iterator<Integer> iterator = sayilar.iterator();
        while (iterator.hasNext()){//ilersinde eleman var mi
            if (sayilar2.contains(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(sayilar);

        System.out.println("List Iterator ile listeyi gezme");
        ListIterator<Integer> listIterator = sayilar2.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Index " + listIterator.nextIndex() + ": " +listIterator.next());
        }

        System.out.println("List Iterator ile listeyi sondan basa dogru gezme");
        ListIterator<Integer> listIteratorSondanBasa= sayilar2.listIterator(sayilar2.size());
        while (listIteratorSondanBasa.hasPrevious()){
            System.out.println("Index " + listIteratorSondanBasa.previousIndex() + ": " + listIteratorSondanBasa.previous());
        }

    }
}
