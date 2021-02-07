package com.company.kontrolyapilari;

public class BreakVeContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i==4) {
                break;
            }

            System.out.println("I'nin degeri: "+i);
        }

        distakifor:
        for (int i = 0; i < 5; i++) {

            icerdekifor:
            for (int j = 0; j < 3; j++) {
                System.out.println("i="+ i +" j="+j);

                if (i == 1 && j == 2) {
                    break distakifor;//etiketin oldugu For islemi iptal edilir
                }
            }
        }

        for (int i = 0; i < 5; i++) {

            if (i==2) {
                continue;//bu satirdan sonraki islemleri ignore edip; for islemine devam edecektir.
            }
            System.out.println("i degeri="+i);
        }

        for (int i = 0; i < 5; i++) {

            if (i==2) {
                return;//ilgili metotdan cikma komutudur.
            }
            System.out.println("return i degeri="+i);
        }
    }
}
