package com.company.bolum_8_azkodcokis.polymorphisim_ve_dynamic_binding;

public class PolymorphisimKavrami {

    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Kopek kopek = new Kopek("Golden");
        Kedi kedi = new Kedi("Van Kedisi");

        adiniSoyle(hayvan);
        adiniSoyle(kopek);
        adiniSoyle(kedi);
    }

    public static void adiniSoyle(Hayvan hayvan) {
        hayvan.adiniSoyle();
    }
}

class Hayvan {

    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public void adiniSoyle() {
        System.out.println("Ben hayvan sinifi nesnesiyim.");
    }
}

class Kopek extends Hayvan {

    private String tur;

    public Kopek(String tur){
        setAyakSayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kopek nesnesiyim");
    }
}

class Kedi extends Hayvan {

    private String cinsi;

    public Kedi(String cinsi) {
        setAyakSayisi(4);
        setCinsi(cinsi);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kedi nesnesiyim");
    }
}