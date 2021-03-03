package com.company.bolum_12_collections.set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSiniflari {

    // elemandan birbirinden farkli olanlari sakla gibi durumlarda Set siniflarini kullaniriz
    // arka planda Map sinifini kullanir
    public static void main(String[] args) {

        // her bir elemanim birbirinden farkli olmasini istiyorum
        // siralama yapmaz
        HashSet<String> harfler = new HashSet<>();
        harfler.add("a");
        harfler.add("b");
        harfler.add("c");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("2");
        harfler.add("e");
        System.out.println(harfler);

        // elemanlar eklenilme sirasina gore ekrana gosterir
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("2");
        linkedHashSet.add("d");

        Object[] geciciDizi = linkedHashSet.toArray();
        System.out.println(geciciDizi[0].toString());

        System.out.println(linkedHashSet);

        // kendi kriterimize gore siralar
        // null deger ekliyemiyoruz. cunku null i nasil sirayalcagini bilemiyor
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("z");
        treeSet.add("d");
        treeSet.add("e");
        treeSet.add("99");
        treeSet.add("2");
        treeSet.add("d");
        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
