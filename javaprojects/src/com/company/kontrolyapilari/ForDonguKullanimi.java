package com.company.kontrolyapilari;

public class ForDonguKullanimi {

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(i+": Muhammed Azman");
        }

        for (int i=0, j=0; (i+j<10); i++, j++) {
            System.out.println("i="+i+" | j="+j+" | (i+j)="+(i+j));
        }

        //for(;;) //sonsuz döngüdür
    }
}
