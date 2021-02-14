package com.company.bolum_8_azkodcokis.polymorphisim_ve_dynamic_binding;

public class CastingInstanceOf {

    //Polymophisim olmasaydi ne olurdu sorusuna örnek bir calismadir
    //Herbir class icin instead of kosulu ile tek tek kontrol edilmesi gerekmektedir.
    public static void main(String[] args) {
        GeometrikSekil geometrikSekil = new GeometrikSekil();
        Kare kare = new Kare(5);
        Dikdortgen dikdortgen = new Dikdortgen(10,22);

        GeometrikSekil gs1 = new Kare(10);
        GeometrikSekil gs2 = new Dikdortgen(5, 20);
        Dikdortgen dikdortgen1 = new Kare(5);

        Dikdortgen dikdortgen2 = (Dikdortgen) gs2;//explicit direk olarak, downcasting

        alaniGoster(geometrikSekil);
        alaniGoster(kare);
        alaniGoster(dikdortgen);

    }

    public static void alaniGoster(GeometrikSekil geometrikSekil){

        //Hiyarasik olarak en alttan en üste dogru yazariz.
        if (geometrikSekil instanceof Kare) {
            Kare kare = (Kare) geometrikSekil;
            kare.alaniHesapla();
            System.out.println("Kare sekil icerisindeki alan hesaplamasini cagirir!");
        } else if (geometrikSekil instanceof Dikdortgen){
            //Hiyarasik olarak Dikdortgen class 2. sirada oldugu icin Kare classindan sonra yazari
            Dikdortgen dikdortgen = (Dikdortgen) geometrikSekil;
            dikdortgen.alaniHesapla();
            System.out.println("Dikgortgen sekil icersindeki alan hesaplamasini cagir!");
        } else if (geometrikSekil instanceof GeometrikSekil) {
            //Bütün class lar GeometrikSekilden olustugu icin her seferinde bu alana giriyor.
            //Bunu engellemek icin bu kosulu en alta koyariz
            geometrikSekil.alaniHesapla();
            System.out.println("Geometrik sekil icerisindeki alan hesaplamasini cagir!");
        }


        //Polimorphisim i kullanmak istiyorsak asagidaki yorum alanini aktif hale getiririz.
        // geometrikSekil.alaniHesapla();
    }
}

class GeometrikSekil{
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik sekil olustu");
    }

    public GeometrikSekil() {
        System.out.println("Geometrik sekil olustu");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alaniHesapla() {
        System.out.println("Alan Degeri: " + (en * boy ));
    }
}

class Dikdortgen extends GeometrikSekil {
    public Dikdortgen(int en, int boy) {
        super(en, boy);
        System.out.println("Diktörgen olustu");
    }

    public Dikdortgen() {
    }

    @Override
    public void alaniHesapla() {
        System.out.println("Dikgörtgen Alan Degeri: " + (getEn() * getBoy() ));
    }
}

class Kare extends Dikdortgen{

    public Kare(int en) {
        super(en, en);
    }

    public Kare() {
    }

    @Override
    public void alaniHesapla() {
        System.out.println("Kare Alan Degeri: " + getEn() * getEn());
    }
}
