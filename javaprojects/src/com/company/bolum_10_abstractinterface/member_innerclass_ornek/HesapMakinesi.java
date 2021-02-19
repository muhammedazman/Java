package com.company.bolum_10_abstractinterface.member_innerclass_ornek;

public class HesapMakinesi {

    int sayi = 0;
    static int sayi2 = 5;

    private void ozelMetot(){

    }

    public String bolmeYap(int sayi1, int sayi2){
        class Bolme{
            public String bolme(int i, int j){
                if (j == 0) {
                    System.out.println("Bölen 0(sifir) olamaz");
                    return "";
                } else {
                    int sonuc = i / j;
                    return String.valueOf(sonuc);
                }
            }
        }

        Bolme bolme = new Bolme();
        String sonuc = bolme.bolme(sayi1, sayi2);
        return sonuc;
    }

    public int carp(int i, int j) {
        Carpma carpma = new Carpma();
        int carpim = carpma.carpim(i,j);
        return carpim;
    }

    public class Topla {
        public int topla(int i, int j){
            return i + j;
        }
    }

    class Cikar{
        public int cikar(int i, int j){
            return i - j;
        }
    }

    private class Carpma{

        int icDegisken;
        static final int staticIcDegisken = 4;
        /*static void statikMetot(){
            System.out.println("static metot");
        } */

        public int carpim(int i, int j){
            System.out.println(sayi);
            System.out.println(sayi2);
            ozelMetot();
            return i * j;
        }
    }

}
