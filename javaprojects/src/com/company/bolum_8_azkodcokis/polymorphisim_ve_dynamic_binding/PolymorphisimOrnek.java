package com.company.bolum_8_azkodcokis.polymorphisim_ve_dynamic_binding;

public class PolymorphisimOrnek {

    public static void main(String[] args) {

        Canli canli = new Canli();
        canli.adiniSoyle();

        Canli kartal = new Kartal();
        kartal.adiniSoyle();
        //kartal.uc();
        ((Kartal) kartal).uc();


        Canli panda = new Panda();
        panda.adiniSoyle();
        //panda.oyna();
        ((Panda) panda).oyna();


        //ClassCastException hatasi alayoruz
        //Panda p2 = (Panda) new Canli();
        //p2.oyna();

        Panda p2 = (Panda) panda;
        p2.oyna(); //Bu sekilde duzgun olarak yazabiliriz
    }

    public static Canli rastgeleSec() {
        int sec = (int) Math.random() * 3;
        Canli canli;
        if (sec == 0) {
            canli = new Canli();
        } else if (sec == 1) {
            canli = new Kartal();
        } else {
            canli = new Panda();
        }

        return canli;
    }
}

class Canli {

    public void adiniSoyle(){
        System.out.println("Ben bir hayvan sinifi nesnesiyim");
    }
}

class Kartal extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kartal sinifi nesnesiyim");
    }

    public void uc(){
        System.out.println("Ben ucabilirim");
    }
}

class Panda extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir panda sinifi nesnesiyim");
    }

    public void oyna(){
        System.out.println("Ben oyun oynamyi severim");
    }
}
