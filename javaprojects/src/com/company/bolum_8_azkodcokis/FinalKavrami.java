package com.company.bolum_8_azkodcokis;

public class FinalKavrami {

    public static void main(String[] args) {

        int sayi = 10;
        sayi = 15;

        final int sayi2;
        sayi2 = 55;
        //sayi2 = 60; // final degiskenlerine bir kere atama yapildiktan sonra degistiremiyoruz.

        Kedi d1 = new Kedi();
        Kedi d2 = new Kaplan();

        d1.goster();
        d2.goster();
    }
}

class Kedi{

    //final ile altaki nesneler bunu override edemez bu method icindeki degerleri isler
    //final ile performans acisinidan kodumuzun hizli calismasini saglar.
    final public void goster(){
        System.out.println("Parenteki goster metodu");
    }
}

class Kaplan extends Kedi{

    //MyParentClass goster methodunu final dedigimiz icin Override yapilamaz
    /*
    @Override
    public void goster() {
        super.goster();
    }
    */

    public void childMethod(){
        goster();//final goster methodunu cagiriyoruz
    }

}
