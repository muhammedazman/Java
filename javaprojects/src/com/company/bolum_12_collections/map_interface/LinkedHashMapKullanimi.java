package com.company.bolum_12_collections.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapKullanimi {

    // Linked ile HashMap arasindaki tek fark nesneler eklenildigi gibi okunabilir
    // befor ve after diye alanlar ile onceki ve sonraki alanlari tutan HEADER lar ile birbirlerine baglaniyorlar
    // HEADER 1 2 3 4 >> HEADER (after) 1, 1 (after) 2, 2 (after) 3, 3 (after) 4, 4 (after) HEADER
    // HEADER 1 2 3 4 >> 4 (befor) 3, 3 (befor) 2, 2 (befor) 1, 1 (befor) HEADER, HEADER (befor) 4
    // kayitlar hepsi baglidir. En bastaki en son ile baslanarak uclarda null olusmuyor
    // herbir entrynin bilgilerine Node denir
    public static void main(String[] args) {

        // accesOrder: true yaparsaniz HashMapten bir farkli kalmaz, oldugu gibi false birakirsaniz
        // kayitlara girildigi sirada erisebilirsiniz
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("muhammed", 1);
        linkedHashMap.put(null, 2);
        linkedHashMap.put("hasan", 3);
        linkedHashMap.put("ali", 4);

        for (String gecici : linkedHashMap.keySet()){
            System.out.println(gecici);
        }

        for (int gecici :linkedHashMap.values()) {
            System.out.println(gecici);
        }

        for (Map.Entry<String, Integer> gecici: linkedHashMap.entrySet()) {
            System.out.println(gecici);
        }

        System.out.println(linkedHashMap.get("hasan"));
    }
}
