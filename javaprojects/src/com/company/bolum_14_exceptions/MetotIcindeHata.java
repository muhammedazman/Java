package com.company.bolum_14_exceptions;

public class MetotIcindeHata {

    public static void main(String[] args) {

        try {
            hataOlustur();
        } catch (Exception e) {
            System.out.println("Error: "+ e.toString());
        }
    }

    private static void hataOlustur() {
        String[] dizi = {"abc", "234", null, "bdc"};

        for (int i = 0; i < dizi.length+2; i++) {
            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: "+e.toString());
            }

            System.out.println(dizi[i]);
        }
    }
}
