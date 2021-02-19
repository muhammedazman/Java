package com.company.oop_giris.bolum_7_sorular;

public class Soru4 {

    public static void main(String[] args) {
        BankaHesap emre = new BankaHesap(123, 500);
        BankaHesap hasan = new BankaHesap(213, 1500);
        BankaHesap ayse = new BankaHesap(321, 200);

        ayse.paraYatir(500);
        emre.paraCek(600);
        hasan.paraCek(450);

        BankaHesap.bankaOzetiGoster();

        ayse.kiyasla(emre);//this:ayse
        emre.kiyasla(hasan);//this:emre

    }
}

class BankaHesap{

    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi=0;
    private static int tumHesapSayisi=0;
    private static int operasyonSayisi=0;

    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi += hesapBakiye;
        tumHesapSayisi++;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }

    public void paraYatir(int paraMiktari){
        this.hesapBakiye += paraMiktari;
        operasyonSayisi++;
    }

    public void paraCek(int paraMiktari){
        if(hesapBakiye>=paraMiktari){
            this.hesapBakiye -= paraMiktari;
            operasyonSayisi++;
            tumBankaBakiyesi-=paraMiktari;
        }else{
            System.out.println("Hesabinizda yeterli para yok");
        }
    }
    public static void bankaOzetiGoster(){
        System.out.println("Bankadaki hesap Sayisi "+tumHesapSayisi);
        System.out.println("Bankadaki toplam para  "+tumBankaBakiyesi);
        System.out.println("Bankadaki tüm operasyonlarin sayisi  "+operasyonSayisi);
    }

    public void kiyasla(BankaHesap kiyaslanacakHesap){
        if(this.getHesapBakiye() < kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.getHesapNo() + " nolu kisinin parasi "+kiyaslanacakHesap.getHesapNo()+ " nolu kisinini parasindan azdir");
        } else if(this.getHesapBakiye() > kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.getHesapNo() + " nolu kisinin parasi "+kiyaslanacakHesap.getHesapNo()+ " nolu kisinini parasindan coktur");
        } else {
            System.out.println("Hesapla Esittir");
        }
    }
}
