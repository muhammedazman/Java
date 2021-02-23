package com.company.bolum_11_generics;

public class GenericDiziYazdir<GelenVeriTuru> {

    public void yazdir(GelenVeriTuru[] args) {

        for (GelenVeriTuru gecici: args) {
            System.out.println(gecici);
        }
    }
}
