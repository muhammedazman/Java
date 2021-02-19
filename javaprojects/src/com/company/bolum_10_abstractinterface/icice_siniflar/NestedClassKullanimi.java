package com.company.bolum_10_abstractinterface.icice_siniflar;


public class NestedClassKullanimi {

    public static void main(String[] args) {

        String[] sehirler = {"Ankara", "Bursa", "Izmir"};

        //1.Yontem
        //YaziciSinif.StringDiziYazdir nesne = new YaziciSinif().new StringDiziYazdir();

        //2.Yontem
        YaziciSinif yaziciSinif = new YaziciSinif();
        YaziciSinif.StringDiziYazdir nesne = yaziciSinif.new StringDiziYazdir();
        nesne.stringDiziYazdir(sehirler);


        A.B.C classC = new A().new B().new C();
        A.B classB = new A().new B();

        classC.metotC();
        classB.metotB();

    }
}
