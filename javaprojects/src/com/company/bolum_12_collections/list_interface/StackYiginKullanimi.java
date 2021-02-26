package com.company.bolum_12_collections.list_interface;

import java.util.LinkedList;
import java.util.Stack;

public class StackYiginKullanimi {

    public static void main(String[] args) {
        Stack<String> yigin = new Stack<>();

        yigin.add("Emre");
        yigin.add("Hasan");
        yigin.add("Ali");

        System.out.println(yigin);
        System.out.println(yigin.pop());//en sondaki elemani cikarir
        System.out.println(yigin);
        System.out.println(yigin.peek());//en sondaki elemani gosterir
        System.out.println(yigin);
        System.out.println(yigin.push("Can"));//en sona elemani ekler
        System.out.println(yigin);
        System.out.println(yigin.search("Hasan"));//aranan elemanin oldugu konumu verir. bulamazsa -1, bulursa 1 den buyuk deger doner
        System.out.println(yigin.empty());//bos mu kontrolu yapilir

        LinkedList<String> yigin2 = new LinkedList<>();
        yigin2.push("muhammed");
        yigin2.push("emre");
        yigin2.push("mehmed");
        yigin2.add("yeni kayit");//add ile eklenen en sona ekleniyor.
        yigin2.push("huseyin");

        System.out.println(yigin2.pop());//en sondaki elemani gosterip cikaracak
        System.out.println(yigin2);
    }
}
