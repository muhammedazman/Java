package com.company.bolum_14_exceptions;

public class DegerDondurenBloklar {

    public static void main(String[] args) {
        System.out.println(stringDegerDondurenMetot());
        try {
            System.out.println(stringDegerDondurenMetot2());
        } catch (Exception e) {
            System.out.println("Error (Main()): "+ e.toString());
        }
    }

    private static int test() {
        int sayi1=5, sayi2=4;
        if (sayi1 < sayi2) {
            return -1;
        } else if (sayi1 > sayi2) {
            return 1;
        } else {
            return 0;
        }
    }

    private static String stringDegerDondurenMetot() {
        String selam = "Merhaba";

        try {
            selam = selam + " try";
            ArithmeticException e = new ArithmeticException();
            throw e;
        } catch (Exception e) {
            selam = selam + " catch";
            return selam;
        } finally {
            selam = selam + " finally";
            //return selam;
      }
    }

    private static String stringDegerDondurenMetot2() {
        String selam = "Merhaba";

        selam = selam + " try";
        ArithmeticException e = new ArithmeticException();
        throw e;
    }
}
