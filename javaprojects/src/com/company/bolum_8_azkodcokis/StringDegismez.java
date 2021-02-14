package com.company.bolum_8_azkodcokis;

public class StringDegismez {

    public static void main(String[] args) {

        //bu tarz kullanimlarda Java yeni bir class yapip; icinde String degiskenine deger atar
        String isim = new String("emre");
        String ad = new String("emre");

        //intern metotu ile yeniIsim degiskeni StringPool a tasinir. Hem heap alaninda hem de String Pool dan erisilebilir.
        String yeniIsim = new String("emre").intern();

        System.out.println(isim == ad);//false
        System.out.println(isim.equals(ad));//true

        String abc = "muhammed";
        String def = "muhammed";

        System.out.println(abc == def);//true

        String yeni = abc.concat(" azman");
        System.out.println(abc);//muhammed
        System.out.println(yeni);//muhammed azman
    }
}
