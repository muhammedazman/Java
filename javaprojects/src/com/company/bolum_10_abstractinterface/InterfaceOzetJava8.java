package com.company.bolum_10_abstractinterface;

public class InterfaceOzetJava8 {

    public static void main(String[] args) {
        SinifA a = new SinifA();
        a.metodA();
        a.defaultMetot();
        a.metotA();

        boolean sonuc = InterfaceA.emailKontrol("vmazman@gmail.com");
        System.out.println("Sonuc: "+sonuc);
    }
}

interface InterfaceA {

    void metodA();
    default void defaultMetot(){
        System.out.println("Ben defaut metotum");
    }

    static final int sayi = 10;

    static boolean emailKontrol(String email){
        if(email.contains("@")){
            return true;
        } else {
            return false;
        }
    }
}

abstract interface InterfaceB extends InterfaceA{
    void metotB();
    void metotA();

    static void Ahmet(){

    }
}

class SinifA implements InterfaceB{

    @Override
    public void metodA() {
        defaultMetot();
    }

    @Override
    public void defaultMetot() {
        System.out.println("Override edilmis default metot");
    }

    @Override
    public void metotB() {

    }

    @Override
    public void metotA() {
        //InterfaceB den gelen metotdur
    }
}