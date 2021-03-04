package com.company.bolum_13_collections_project.udemykursplayer;

public class Ders {

    private double dersNo;
    private String dersBaslik;
    private double dakika;

    public Ders(int dersNo, String dersBaslik, double dakika) {
        this.dersNo = dersNo;
        this.dersBaslik = dersBaslik;
        this.dakika = dakika;
    }

    public double getDersNo() {
        return dersNo;
    }

    public String getDersBaslik() {
        return dersBaslik;
    }

    public double getDakika() {
        return dakika;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "dersNo=" + dersNo +
                ", dersBaslik='" + dersBaslik + '\'' +
                ", dakika=" + dakika +
                '}';
    }
}
