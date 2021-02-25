public class RasyonelSayi implements Comparable<RasyonelSayi> {

    private int pay;
    private int payda;
    private String islem;
    private static String TOPLAM = "Toplam";
    private static String FARK = "Fark";
    private static String CARPIM = "Carpim";
    private static String BOLME = "Bolme";

    public RasyonelSayi(){
        pay=0;
        payda=1;
    }

    public RasyonelSayi(int pay, int payda){
        int ebob = ebobBul(pay, payda);
        this.pay = (payda > 0 ? 1:-1) * (pay/ebob);
        this.payda = Math.abs(payda)/ebob;
    }

    private int ebobBul(int pay, int payda) {

        int payMutlakDeger = Math.abs(pay);
        int paydaMutlakDeger = Math.abs(payda);
        int ebob=1;

        for (int i = 1; i <= payMutlakDeger && i <= paydaMutlakDeger; i++) {
            if(payMutlakDeger % i == 0 && paydaMutlakDeger % i == 0){
                ebob = i;
            }
        }

        return ebob;
    }

    public RasyonelSayi topla(RasyonelSayi toplanacakSayi){
        int yeniPay = (this.pay * toplanacakSayi.payda) + (this.payda * toplanacakSayi.pay);
        int yeniPayda = payda * toplanacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(yeniPay, yeniPayda);
        sonuc.islem = TOPLAM;
        return sonuc;
    }

    public RasyonelSayi cikar(RasyonelSayi cikarilacakSayi){
        int yeniPay = (this.pay * cikarilacakSayi.payda) - (this.payda * cikarilacakSayi.pay);
        int yeniPayda = payda * cikarilacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(yeniPay, yeniPayda);
        sonuc.islem = FARK;
        return sonuc;
    }

    public RasyonelSayi carp(RasyonelSayi carpilacakSayi){
        int yeniPay = this.pay * carpilacakSayi.pay;
        int yeniPayda = this.payda * carpilacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(yeniPay, yeniPayda);
        sonuc.islem =  CARPIM;
        return sonuc;
    }

    public RasyonelSayi bol(RasyonelSayi bolunecekSayi){
        int yeniPay = this.pay * bolunecekSayi.payda;
        int yeniPayda = this.payda * bolunecekSayi.pay;

        RasyonelSayi sonuc = new RasyonelSayi(yeniPay, yeniPayda);
        sonuc.islem = BOLME;
        return sonuc;
    }


    @Override
    public String toString() {
        String sonuc="";
        if (islem!=null){
            sonuc=islem + ": ";
        }
        if(payda==1){
            return  sonuc + pay + "";
        } else {
            return  sonuc + pay + "/" + payda;
        }
    }

    @Override
    public int compareTo(RasyonelSayi o) {
        if (this.cikar(o).pay > 0){
            return 1;
        } else if (this.cikar(o).pay < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
