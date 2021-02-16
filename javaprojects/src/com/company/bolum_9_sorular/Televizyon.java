package com.company.bolum_9_sorular;

import java.util.ArrayList;

public class Televizyon {

    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>();
        ses = 10;
        aktifKanal=1;
        kanallariOlustur();
        this.acik = false;
    }

    public void aktifKanaliGoster(){
        if (acik == true) {
            System.out.println("Aktif Kanal = " + kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        } else {
            System.out.println("Önce TV yi aciniz");
        }

    }

    public void kanalDegistir(int aciklmasiIstenilenKanal) {
        if (acik) {
            if (aciklmasiIstenilenKanal != aktifKanal){

                if (aciklmasiIstenilenKanal <= kanallar.size() && aciklmasiIstenilenKanal >= 0) {
                    aktifKanal = aciklmasiIstenilenKanal;
                    System.out.println("Kanal " + aciklmasiIstenilenKanal +" Kanal Bilgisi: "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
                } else {
                    System.out.println("gecerli bir kanal numarasi giriniz");
                }
            }
        } else {
            System.out.println("Önce TV yi aciniz");
        }
    }

    public void sesAzalt(){
        if(ses > 0 && acik== true){
            ses--;
            System.out.println("Ses seviyesi: "+ses);
        } else if (acik == false) {
            System.out.println("önce tv yi aciniz");
        } else {
            System.out.println("ses minumunda; daha fazla azalatamazsin");
        }

    }

    public void sesArttir() {
        if (ses <= 20 && acik == true) {
            ses++;
            System.out.println("Ses seviyesi: " + ses);
        } else if (acik == false) {
            System.out.println("önce tv yi aciniz");
        }else {
            System.out.println("ses maximumda; daha fazla arttiramazsin");
        }

    }

    public void tvAc(){
        if (acik == false) {
            acik = true;
            System.out.println("Tv acildi");
        } else {
            System.out.println("TV zaten acik");
        }
    }

    public void tvKapat(){
        if (acik == true) {
            acik = false;
            System.out.println("Tv kapatildi");
        } else {
            System.out.println("TV zaten kapali");
        }
    }

    private void kanallariOlustur(){
        HaberKanali cnn = new HaberKanali("CNN", 1, "Genel Haber");
        MuzikKanali dreamTurk = new MuzikKanali("Dream Turk", 2, "Yerli Pop Müzik");
        HaberKanali beinSport = new HaberKanali("Bein Sport", 3, "Spor Haber Kanali");
        MuzikKanali numberOne = new MuzikKanali("Number One", 4, "Yabanci Pop Müzik");

        kanallar.add(cnn);
        kanallar.add(dreamTurk);
        kanallar.add(beinSport);
        kanallar.add(numberOne);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public ArrayList<Kanal> getKanallar() {
        return kanallar;
    }

    public void setKanallar(ArrayList<Kanal> kanallar) {
        this.kanallar = kanallar;
    }

    public int getAktifKanal() {
        return aktifKanal;
    }

    public void setAktifKanal(int aktifKanal) {
        this.aktifKanal = aktifKanal;
    }

    @Override
    public String toString() {
        return "Televizyon{" +
                "marka='" + marka + '\'' +
                ", boyut='" + boyut + '\'' +
                '}';
    }

}
