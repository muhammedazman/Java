package com.company.bolum_14_exceptions;

public class BirdenFazlaCatch {

    public static void main(String[] args) {

        String[] dizi = {"abc", "234", null, "bdc"};

        for (int i = 0; i < dizi.length+2; i++) {
            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: "+e.toString());
            } catch (NullPointerException e) {
                System.out.println("Error: "+e.toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: "+e.toString());
            }
        }

        System.out.println("code devam ediyor");

        for (int i = 0; i < dizi.length+2; i++) {
            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (Exception e) {
                System.out.println("Error: "+e.toString());
            }
        }

        System.out.println("code devam ediyor 2");

        try {
            int sayi = dizi[1].length() + Integer.parseInt(dizi[6]);
        } catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
