package com.company.lambda_ornek;

import java.util.function.Function;

public class Alistirmalar {

    public static void main(String[] args) {
        // 1-Kelimeler iceren bir String ifadesini bosluklara göre parcalayip ekrana yazdiran bir threadi Lamda ifadesi ile calistirin
        // 2-Function interfacesinin apply methodunu gerceklestirin.(function interfacesini dokumantasyondan arastirin)
        // 3-bu method icinde gitilen ifadenin cift sayili pozisyonlarinda bulunan karakterleri geriye dönecek sekilde yazilimi
        // 4-main sinidi metodu olusturun, bu method function interfacesini ve string ifadesýi parametrre olarark alip
        // sonucu string olarak geriye dondurun

        String kelime = "emre altunbilek Java Egitim Seti";

        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                String[] kelimeler = kelime.split(" ");
                for (String s : kelimeler) {
                    System.out.println(s);
                }
            }
        }).start();
        */
        // Soru 1
        System.out.println("Lambda ornegi");
        new Thread(() -> {
            String[] kelimeler = kelime.split(" ");
            for (String s : kelimeler) {
                System.out.println(s);
            }
            }).start();


        // soru 2
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (i%2 == 0) {
                        builder.append(s.charAt(i));
                    }
                }
                return builder.toString();
            }
        };

        // soru 3
        Function<String, String> function1 = s -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i%2 == 0) {
                    builder.append(s.charAt(i));
                }
            }
            return builder.toString();
        };

        System.out.println(function.apply(kelime));
        System.out.println(function1.apply(kelime));

        // Soru 4
        System.out.println("Soru 4: "+ ciftPozisyondakiKarakterleriYazdir(function1, "kaynak kelime"));
    }

    public static String ciftPozisyondakiKarakterleriYazdir(Function<String, String> func, String kaynak) {
        return func.apply(kaynak);
    }
}
