package com.company.bolum_14_exceptions;

import java.sql.SQLException;

public class ThrowsKavrami {

    public static void main(String[] args) {
        try {
            metot3();
        } catch (NumberFormatException e) {
            System.out.println("Error: "+e);
        }
    }

    private static void metot() throws NumberFormatException, NullPointerException {
        Integer sayi = Integer.parseInt("abc");
    }

    private static void metot2() throws NumberFormatException {
        metot();
    }

    private static void metot3() throws NumberFormatException {
        metot2();
    }
}

class A {

    void  aMetotu() throws SQLException {
        System.out.println("A sinifindaki metot");
    }
}

class B extends A{

    @Override
    void aMetotu() throws ArrayIndexOutOfBoundsException, SQLException {
        System.out.println("B sinifindaki metot");
    }
}

class C extends B{
    @Override
    void aMetotu() throws ArrayIndexOutOfBoundsException, NullPointerException, SQLException {
        System.out.println("C sinifindaki metot");
    }
}