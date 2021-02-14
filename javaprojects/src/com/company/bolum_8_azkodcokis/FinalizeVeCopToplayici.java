package com.company.bolum_8_azkodcokis;

public class FinalizeVeCopToplayici {

    //java 9 dan sonra finilize kaldirildi.
    public static void main(String[] args) {
        A nesne1 = new A(10);
        A nesne2 = new A(15);

        nesne1 = nesne2;

        for (int i = 0; i < 100; i++) {
            nesne2 = new A(500);

            if (i == 10){
                System.gc();//garbage collector calistirilmadan once finalize methodu calisir.
            }
        }

    }
}

class A{

    int i;

    public A(int parametre){
        this.i = parametre;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize tetiklendi");
    }
}
