package com.company.bolum_14_exceptions;

public class ExceptionKavrami {

    public static void main(String[] args) {

        try {
            Integer i = new Integer("asd");
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }

        try {
            int sonuc = 5/0;
        } catch (Exception e) {
            System.out.println("Error: "+ e.toString());
        }

        try {
            int[] sayilar = {1,2,3};
            System.out.println(sayilar[4]);
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }

        try {
            Object o = new Object();
            String s = (String) o;
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        } finally {
            System.out.println("finally blok calistirildi");
            System.out.println("program devam etmeli");
        }

    }
}
