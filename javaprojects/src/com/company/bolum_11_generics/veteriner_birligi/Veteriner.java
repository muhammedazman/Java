package com.company.bolum_11_generics.veteriner_birligi;

public class Veteriner extends Kisi{

    private String mezunOlduguOkul;
    private int calismaSuresi;

    public Veteriner(String isim, String tckimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tckimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString() + " ben bir veterinerim");
    }

    @Override
    public String toString() {
        return "Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
