package com.company.bolum_9_sorular;

public class TestSoru3 {

    public static void main(String[] args) {
        C3 cSinifi = new C3();

        System.out.println(cSinifi.metin);
        /*
        A
        B
        C
         */
    }
}

class C1
{
    String metin = "Sinif A";
}

class C2 extends C1
{
    String metin = "Sinif B";

    {
        System.out.println(super.metin);
    }
}

class C3 extends C2
{
    String metin = "Sinif C";

    {
        System.out.println(super.metin);
    }
}