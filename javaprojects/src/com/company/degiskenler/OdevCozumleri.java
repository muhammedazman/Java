package com.company.degiskenler;

public class OdevCozumleri {
    public static void main(String[] args) {
        //ÖDEV 1 CÖZÜMÜ
        System.out.println("COZUM 1");
        String sayi = "150";
        int neuSayi1 = Integer.parseInt(sayi);
        int neuSayi2 = Integer.valueOf(sayi);
        System.out.println("Integer.parseInt(sayi): "+ neuSayi1 + "\nInteger.valueOf(sayi): "+ neuSayi2);

        String neuString = String.valueOf(neuSayi1);
        System.out.println("String.valueOf(neuSayi1): "+neuString);
        System.out.println("********************************************************");

        //ÖDEV 2 CÖZÜMÜ
        System.out.println("COZUM 2");
        int intSayi = 5/3;//noktala ifade tutmaz
        float floatSayi=5f/3f;//float virgulden sonra 7 karakter saklama
        double doubleSayi = 5d/3d;//double virgulden sonra 16 karakter saklama
        System.out.println("int sayi sonuc: "+ intSayi);
        System.out.println("float sayi sonuc: "+ floatSayi);
        System.out.println("double sayi sonuc: "+ doubleSayi);
        System.out.println("********************************************************");

        //ÖDEV 3 CÖZÜMÜ
        System.out.println("COZUM 3");
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//o.5 degerini görmeyi bekliyoruz
        System.out.println(1.0 - 0.9);//0.1 degerini gormeyi bekliyoruz 0.10000000000..

        System.out.println("********************************************************");

        //ÖDEV 4 CÖZÜMÜ
        System.out.println("COZUM 4");
        int s1 = 1;
        int s2 = 2;
        double ortlama1 = (s1 +s2)/2;// virgulden sonrasini ekrana yazmadan double degerine donusturdu. eger (double) a cascade yapsaydik hata almayacaktik.
        System.out.println("d Ortamala 1: "+ortlama1);

        double ortalama2 = (s1 + s2)/2d;//2.0
        System.out.println("d Ortalama 2: "+ortalama2);
    }
}
