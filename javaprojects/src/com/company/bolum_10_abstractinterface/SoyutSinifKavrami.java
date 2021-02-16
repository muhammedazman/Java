package com.company.bolum_10_abstractinterface;

public class SoyutSinifKavrami {

    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(5);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare) kare).adiniSoyle();

        GeometrikSekil dikdortgen = new Dikdortgen(10, 12);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        ((Dikdortgen) dikdortgen).adiniSoyle();

        GeometrikSekil daire = new Daire(5);
        daire.cevreHesapla();
        daire.alanHesapla();
        ((Daire) daire).adiniSoyle();

        alanlariKarsilastir(kare, dikdortgen);
    }

    public static void alanlariKarsilastir(GeometrikSekil gs1, GeometrikSekil gs2){
        if (gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnenin alan ikinci parametredeki nesnenin alanindan kücüktür");
        } else if (gs1.getHesaplananAlan() > gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnenin alan ikinci parametredeki nesnenin alanindan büyüktür");
        } else {
            System.out.println("alanlar birbirlerine esittir");
        }

        System.out.println("Birinci Alan: " + gs1.getHesaplananAlan()+ " Ikinci Alan: " + gs2.getHesaplananAlan());
    }
}

abstract class GeometrikSekil{
    private int birinciKenar;
    private int hesaplananAlan;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }
}

class Kare extends GeometrikSekil {

    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin cevresi: "+(getBirinciKenar() * 4));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getBirinciKenar());
        System.out.println("Karenin alani: "+ getHesaplananAlan());
    }

    public void adiniSoyle() {
        System.out.println("Ben bir kare nesnesiyim");
    }
}

class Dikdortgen extends GeometrikSekil {

    private int ikiciKenar;

    public Dikdortgen(int birinciKenar, int ikiciKenar) {
        setBirinciKenar(birinciKenar);
        this.ikiciKenar = ikiciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdortgenin cevresi: "+ ((getBirinciKenar() + ikiciKenar)*2));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getIkiciKenar());
        System.out.println("Dikdörtgenin alani: "+ getHesaplananAlan());
    }

    public int getIkiciKenar() {
        return ikiciKenar;
    }

    public void setIkiciKenar(int ikiciKenar) {
        this.ikiciKenar = ikiciKenar;
    }

    public void adiniSoyle() {
        System.out.println("Ben bir dikdortgen nesnesiyim");
    }
}

class Daire extends GeometrikSekil {

    public Daire(int yariCapi) {
        this.setBirinciKenar(yariCapi);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin cevresi: "+ (2 *  (3.14 * getBirinciKenar())));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (3.14 * getBirinciKenar() * getBirinciKenar()));
        System.out.println("Dairenin alani: "+ getHesaplananAlan());
    }

    public void adiniSoyle() {
        System.out.println("Ben bir daire nesnesiyim");
    }
}