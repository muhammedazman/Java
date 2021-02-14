package com.company.bolum_8_azkodcokis.polymorphisim_ve_dynamic_binding;

public class BindingTurleri {

    public static void main(String[] args) {
     /* UstSinif.adiniSoyleStatic();
        AltSinif.adiniSoyleStatic();

        System.out.println("**************");

        UstSinif ustSinif = new UstSinif();
        ustSinif.adiniSoyleStatic();

        AltSinif altSinif = new AltSinif();
        altSinif.adiniSoyleStatic();

        System.out.println("**************");

        UstSinif sinif = new AltSinif();
        sinif.adiniSoyleStatic(); */

        UstSinif ustSinif = new UstSinif();
        ustSinif.adiniSoyle();

        AltSinif altSinif = new AltSinif();
        altSinif.adiniSoyle();

        UstSinif sinif = new AltSinif();
        sinif.adiniSoyle();//Dynamic Bindig
    }
}

class UstSinif {

    public static void adiniSoyleStatic() {
        System.out.println("Üst sinifin static adini soyle metotut cagridi");
    }

    public void adiniSoyle() {
        System.out.println("Üst sinifin static adini soyle metotut cagridi");
    }
}

class AltSinif extends UstSinif{
    public static void adiniSoyleStatic() {
        //static metotlar exteds yapilarda Override edilemiyor
        System.out.println("Alt sinifin static adini soyle metotut cagridi");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Alt sinifin static adini soyle metotut cagridi");
    }
}