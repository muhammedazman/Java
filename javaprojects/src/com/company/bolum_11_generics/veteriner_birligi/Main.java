package com.company.bolum_11_generics.veteriner_birligi;

public class Main {

    public static void main(String[] args) {

        ilkNesneleriOlustur();

    }

    private static void ilkNesneleriOlustur(){
        Kedi kedi = new Kedi("01-01-2016", true, "Van Kedisi");
        Kedi kedi2 = new Kedi("01-04-2016", false, "Siyam Kedisi");
        Kedi kedi3 = new Kedi("05-04-2016", false, "Tekir");

        Kopek kopek = new Kopek("02-06-2016", false, 1, "Golden");
        Kopek kopek2 = new Kopek("02-06-2017", false, 2, "Dalmacyali");
        Kopek kopek3 = new Kopek("06-10-2016", false, 4, "Pitbul");

        Musteri m1 = new Musteri("emre", "123", "ankara");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);

        Musteri m2 = new Musteri("hasan", "234", "izmir");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);

        Musteri m3 = new Musteri("ali", "567", "istanbul");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);

        Veteriner v1 = new Veteriner("ayse", "456", "ankara üniversitesi", 1);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);

        Veteriner v2 = new Veteriner("fatma", "567", "ege üniversitesi", 2);
        v2.musteriEkle(m1);
        v2.musteriEkle(m3);

        Veteriner v3 = new Veteriner("hayriye", "678", "marmara üniversitesi", 3);
        v3.musteriEkle(m3);

        v1.musterileriListele();

        SehirVeterinerlikleri sehirVeterinerlikleri = new SehirVeterinerlikleri("Ankara");
        sehirVeterinerlikleri.sehireVeterineEkle(v1);
        sehirVeterinerlikleri.sehireVeterineEkle(v2);
        sehirVeterinerlikleri.toplamVeterinerSayisiniBul();

        SehirVeterinerlikleri sehirVeterinerlikleriIzmir = new SehirVeterinerlikleri("Izmir");
        sehirVeterinerlikleriIzmir.sehireVeterineEkle(v2);
        sehirVeterinerlikleriIzmir.sehireVeterineEkle(v3);
        sehirVeterinerlikleriIzmir.toplamVeterinerSayisiniBul();

        SehirVeterinerlikleri sehirVeterinerlikleriIstanbul = new SehirVeterinerlikleri("IStanbul");
        sehirVeterinerlikleriIstanbul.sehireVeterineEkle(v1);
        sehirVeterinerlikleriIstanbul.sehireVeterineEkle(v3);
        sehirVeterinerlikleriIstanbul.toplamVeterinerSayisiniBul();

        System.out.println("Yönetim Paneli");
        YonetimPanali<Hayvan> hayvanYonetimPanali = new YonetimPanali();
        hayvanYonetimPanali.bilgileriGoster(kedi);
        hayvanYonetimPanali.bilgileriGoster(kopek);

        YonetimPanali<Musteri> musteriYonetimPanali = new YonetimPanali();
        musteriYonetimPanali.bilgileriGoster(m1);
        musteriYonetimPanali.bilgileriGoster(m2);

        musteriYonetimPanali.sahipOlduguHayvanlariGoster(m1);

        musteriYonetimPanali.veterinerMusterileriniListele(v1);

    }
}
