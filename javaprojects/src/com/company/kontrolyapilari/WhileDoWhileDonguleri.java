package com.company.kontrolyapilari;

public class WhileDoWhileDonguleri {

    public static void main(String[] args) {
        int sayi = 10;
        while(sayi < 20){ //sayi<20 bu ifade true olduğu sürece çalışır.
            //birşeyler yap
            System.out.println("Merhaba sayi: "+sayi);
            sayi ++;
        }

        for (int i = 10; i<=20; i++) {
            System.out.println("For döngüsü merhaba sayi: "+i);
        }

        int s1=0;
        do{
            System.out.println("Hello s1: "+s1);
            //s1--;//sonsuz donguye neden olur
            s1++;
        }while(s1<5);
    }
}
