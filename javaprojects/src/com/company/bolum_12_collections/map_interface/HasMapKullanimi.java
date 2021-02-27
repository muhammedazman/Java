package com.company.bolum_12_collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HasMapKullanimi {

    public static void main(String[] args) {
        //LinkedMap: ekledigim sirada gorebilirim
        //HashMap: olusan Hash degerine gore siralar
        //TreeMap: belli bir mantiga gore siralar. Stringler, integerler vs.

        HashMap<Integer, String> plakalar = new HashMap<>();
        plakalar.put(1,"Adana");
        plakalar.put(34,"Istanbul");
        plakalar.put(16,"Bursa");
        plakalar.put(35,"Izmir");
        plakalar.put(06,"Ankara");
        plakalar.put(06,"asdsad");//Ankara kaydini ezer. containValue ile aratinca Ankarayi bulamaz
        plakalar.put(null,"null deger");

        HashMap<Integer, String> plakalarYedek = new HashMap<>();
        System.out.println("plakalar yedek size: "+ plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println("plakalar yedek (putAll) yeni size: "+ plakalarYedek.size());
        System.out.println(plakalar);
        String il = plakalar.get(16);
        System.out.println(il);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.get(06));//en son girdigim degeri gosterir
        System.out.println(plakalar.get(null));//kayit doner
        System.out.println(plakalar.containsKey(16));
        System.out.println(plakalar.containsValue("Adana"));
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.size());
        System.out.println(plakalar.hashCode());

        for (Integer key:plakalar.keySet()) {
            System.out.print("Keyler: "+key+ ", ");
        }
        System.out.println("Degerler");
        for (String value:plakalar.values()) {
            System.out.print("Value: "+value+", ");
        }

        for (Map.Entry<Integer, String> entry:plakalar.entrySet()) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}
