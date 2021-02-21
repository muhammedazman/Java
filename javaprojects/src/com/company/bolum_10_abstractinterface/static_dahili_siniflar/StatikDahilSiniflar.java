package com.company.bolum_10_abstractinterface.static_dahili_siniflar;

public class StatikDahilSiniflar {

    public static void main(String[] args) {

        CerceveSinif cerceveSinif = new CerceveSinif();
        cerceveSinif.nesneDegiskeni = 5;
        cerceveSinif.metot();
        cerceveSinif.statikMetot();

        CerceveSinif.statikMetot();

        CerceveSinif.IcSinif icSinif = new CerceveSinif.IcSinif();
    }
}
