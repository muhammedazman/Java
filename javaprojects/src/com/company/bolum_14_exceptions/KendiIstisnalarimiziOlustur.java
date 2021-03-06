package com.company.bolum_14_exceptions;

import java.util.Scanner;

public class KendiIstisnalarimiziOlustur {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = tara.nextInt();

        try {
            if (yas < 0) {
                throw new NegatifYasHatasi("Yas negatif olamaz");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}

class NegatifYasHatasi extends Exception {

    String hataMesaji;

    public NegatifYasHatasi(String hataMesaji) {
        super(hataMesaji);
        this.hataMesaji = hataMesaji;
    }

    @Override
    public String toString() {
        return "NegatifYasHatasi{" +
                "hataMesaji='" + hataMesaji + '\'' +
                '}';
    }
}
