package com.company.bolum_12_collections.list_interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VektorKullanimi {

    public static void main(String[] args) {
        Vector<String> sehirler = new Vector<>(2);
        System.out.println(sehirler.capacity());
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Ankara");
        System.out.println(sehirler.capacity());

        System.out.println(sehirler.firstElement());
        System.out.println(sehirler.lastElement());

        for (int i = 0; i < sehirler.size(); i++) {
            System.out.print(sehirler.get(i)+ ", ");
        }

        System.out.println("\niterator kullanimi");

        Iterator<String> iterator = sehirler.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        System.out.println("enumeration kullanimi");

        //iteratorun vector icin olan hali
        Enumeration<String> enumeration = sehirler.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+", ");
        }
    }
}
