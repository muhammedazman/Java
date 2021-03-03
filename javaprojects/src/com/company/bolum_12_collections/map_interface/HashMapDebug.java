package com.company.bolum_12_collections.map_interface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDebug {

    public static void main(String[] args) {

        // initialCapacity HasMap 16 dizinden olusacak
        // loadFactor: yuzde 75 e erisince tekrar 16 dizi daha ekle demek oluyor
        HashMap<String, Integer> map = new HashMap<>(16,0.75f);
        map.put("muhammed", 1);
        map.put("gs", 2);
        map.put(null, 123456);
        map.put("Ea", 3);
        map.put("Ea", 5);

        System.out.println(map.get("Ea"));

        // map.keySet().iterator() alternatif olarak bu kodu da kullanabilriz
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("bu kod ile sadece keyler gelir");
        Iterator iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
