package com.company.bolum_10_abstractinterface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {

    public static void main(String[] args) {

        MuslumBaba muslum = new MuslumBaba();
        muslum.sahnedeSigaraIc();

        PopSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopSarkiciOzellikleri popSarkici2 = new Hadise();

        PopSarkiciOzellikleri dizi[] = new PopSarkiciOzellikleri[5];
        dizi[0] = popSarkici1;
        dizi[1] = popSarkici2;

        ArrayList<PopSarkiciOzellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);
    }
}

interface Kisi{
    void yemekYe();
    void sporYap();
}

interface OgrenciOzellikleri extends Kisi, UniversiteOgrencisi{
    void dersCalis();
    void okulaGit();
}

interface UniversiteOgrencisi{
    void finallereCalis();
}

abstract class Sarkici implements Kisi {
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void sahnedeSigaraIc();
}

interface PopSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
    int yas = 50;//default static ve final
}

class Ogrenci implements OgrenciOzellikleri{

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }

    @Override
    public void dersCalis() {

    }

    @Override
    public void okulaGit() {

    }

    @Override
    public void finallereCalis() {

    }
}

class Tarkan implements PopSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

class Hadise implements PopSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

class ArabeskSarkici extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk sarkici sarki soyluyor");

    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class PopSarkicisi extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkici sarki soyluyor");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class MuslumBaba implements ArabeskSarkiciOzellikleri, PopSarkiciOzellikleri {

    @Override
    public void sahnedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}