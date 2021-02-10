package com.company.oop_giris;

public class StaticKavrami {

    //Static ile degiskenlerimizi nesneye bagli olmasini engelleriz. Her olusturulan class dosyasini sayan programdir.
    public static void main(String[] args) {
        Memur m1 = new Memur();
        m1.setIsim("Emre");
        m1.setMaas(4000);

        Memur m2 = new Memur();
        m2.setIsim("Hasan");
        m2.setMaas(4500);

        Memur m3 = new Memur();
        m3.setIsim("Hasan");
        m3.setMaas(4500);

        m1.bilgileriGoster();
        m2.bilgileriGoster();
        System.out.println(m3.sayiMemurNesnesi);

        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();
    }
}

class Memur {
    private String isim;
    private int maas;
    public static int sayiMemurNesnesi;

    public Memur(){
        sayiMemurNesnesi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas < 0){
            maas = 0;
        } else {
            this.maas = maas;
        }
    }

    public static void kanunuSoyle() {
        System.out.println("657 nolu kanun gecerli");
    }

    public void bilgileriGoster() {
        System.out.println("Olusturulan memur lsitesi: "+sayiMemurNesnesi);
    }
}
