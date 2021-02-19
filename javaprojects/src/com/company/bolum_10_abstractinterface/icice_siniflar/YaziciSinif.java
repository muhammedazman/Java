package com.company.bolum_10_abstractinterface.icice_siniflar;

public class YaziciSinif {

    private int privateDegisken = 1;
    int defaultDegisken= 2;
    protected int protectedDegiskeni = 3;
    public int publicDegisken = 4;

    private void privateMetot(){
        StringDiziYazdir nesne = new StringDiziYazdir();
        System.out.println(nesne.privateDegiskenDahili);
        System.out.println(nesne.protectedDegiskeniDahili);
        System.out.println(nesne.defaultDegiskenDahili);
        System.out.println(nesne.publicDegiskenDahili);
    }

    void defaultMetot(){}
    protected void protectedMetot(){}
    public void publicMetot(){}

    class StringDiziYazdir{

        private int privateDegiskenDahili = 1;
        int defaultDegiskenDahili= 2;
        protected int protectedDegiskeniDahili = 3;
        public int publicDegiskenDahili = 4;

        {
            //isimsiz initialize alanina izin veriyor
        }

        //sadece static dersek hata aliriz. InnerClass icersinde static olmaz, ama final kullanimina izin veriyor
        static final int sayi = 52;

        void stringDiziYazdir(String[] dizi){

            System.out.println(privateDegisken);
            System.out.println(defaultDegisken);
            System.out.println(protectedDegiskeni);
            System.out.println(publicDegisken);

            privateMetot();
            defaultMetot();
            protectedMetot();
            publicMetot();

            for (String gecici: dizi) {
                System.out.println(gecici);
            }
        }
    }

    abstract class AbstractInnerSinif{

    }

    final class FinalAbstracSinif{

    }

    /* abstract final class Aasd{

    }
    */
}

class A{

    class B{

        void metotB(){

        }

        class C{

            void metotC(){

            }
        }
    }
}
