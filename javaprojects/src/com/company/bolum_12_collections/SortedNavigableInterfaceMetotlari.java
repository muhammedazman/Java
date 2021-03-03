package com.company.bolum_12_collections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedNavigableInterfaceMetotlari {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("4");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1",1);
        treeMap.put("2",2);
        treeMap.put("4",4);
        treeMap.put("5",5);

        // SortedSet ve SortedMap metotlari
        // eger comparator metodu yazarsak onu verecektir, yoksa null degeri doner
        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());

        // girilen degerler arasindaki degerleri yalip yeni TreeSet olusturur
        TreeSet<String> yedekSet = (TreeSet<String>) treeSet.subSet("2", "4");
        System.out.println(yedekSet);
        System.out.println(treeMap.subMap("2","4"));

        // girilen degere kadar olan kayitlari gosterir.
        System.out.println(treeSet.headSet("3"));
        System.out.println(treeMap.headMap("2"));

        System.out.println(treeMap.firstKey());
        System.out.println(treeSet.first());

        System.out.println(treeMap.lastKey());
        System.out.println(treeSet.last());

        // NavigableSet ve navigablemao metotlari

        // 3ten sonra gelen bir kucuk deger
        System.out.println("Lower: " + treeSet.lower("3"));
        System.out.println("LowerKey "+ treeMap.lowerKey("3"));

        // verilen key degerine esit veya ondan 1 kücük degeri verir
        System.out.println("Floor: "+ treeSet.floor("3"));
        System.out.println("FloorKey: " + treeMap.floorKey("3"));

        // floorun tam tersi mantiginda calisir. keyden bir sonraki deger
        System.out.println("celling: "+ treeSet.ceiling("3"));
        System.out.println("cellingKey: "+ treeMap.ceilingKey("3"));

        // girilen keyden büyük degeri döndürür
        System.out.println("higher: "+treeSet.higher("3"));
        System.out.println("higherKey: "+treeMap.higherKey("3"));

        // ilk elemani verir ve sonra yapidan siler
        System.out.println("poll first " + treeSet.pollFirst());
        System.out.println("poll first " + treeMap.pollFirstEntry());

        // son elemani verir ve sonra yapidan siler
        System.out.println("poll last " + treeSet.pollLast());
        System.out.println("poll last " + treeMap.pollLastEntry());

        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
