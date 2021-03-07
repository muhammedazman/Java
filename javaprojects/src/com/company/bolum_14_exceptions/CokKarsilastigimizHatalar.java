package com.company.bolum_14_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CokKarsilastigimizHatalar {

    public static void main(String[] args) {

        //NullPointException
        try {
            String isim;
            System.out.println(Test.isim.length());
        }catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        //ArrayIndexOutOfBoundsException
        try {
            int[] sayilar = {1,2,3};
            System.out.println(sayilar[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        //NumberFormatException
        try {
            int sayi = Integer.parseInt("123");
            int sayi2 = Integer.parseInt("asd");
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        //ClassNotFoundException
        try {
            Class.forName("muhammedSinifi");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getException());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        // AritmeticException
        try {
            int bolum = 10/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
        }


        // SQLException
        Connection connection = null;
        String URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "username";
        String password = "password";

        try {
            connection = DriverManager.getConnection(URL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // ClassCastException
        try {
            UstSinif ustSinif = new UstSinif();
            UstSinif ustSinif1 = new AltSinif();
            AltSinif altSinif = (AltSinif) ustSinif;
        } catch (ClassCastException e) {
            System.out.println(e);
        }

        // IOException
        String dosyaYolu = "C:\\Users\\akyus\\asasda.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(dosyaYolu));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // InterruptedException
        // SecurityException

        System.out.println("program burdan calisiyor");
    }
}

class Test {
    static String isim;
}

class UstSinif {

}

class AltSinif extends UstSinif {

}