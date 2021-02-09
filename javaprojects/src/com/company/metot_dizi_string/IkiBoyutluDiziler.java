package com.company.metot_dizi_string;

public class IkiBoyutluDiziler {

    public static void main(String[] args) {

        //2 x 3 l+k bir matris icin
        int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1;
        sayilar[0][1] = 2;
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;

        //3 x 3 lük pointer farkli sekilde gosterimi
        int[][] sayilar2 =  {{1,2,3}, {4,5,6}, {7,8,9}};
        ikiBoyutluDiziOku(sayilar);

        /*
        *   0 satirin 0 sutunundaki deger : 0
            0 satirin 1 sutunundaki deger : 100
            0 satirin 2 sutunundaki deger : 200
            1 satirin 0 sutunundaki deger : 350
            1 satirin 1 sutunundaki deger : 0
            1 satirin 2 sutunundaki deger : 250
            2 satirin 0 sutunundaki deger : 150
            2 satirin 1 sutunundaki deger : 500
            2 satirin 2 sutunundaki deger : 0
        * */
        int[][] borclar = {{0,100,200}, {350,0,250}, {150,500,0}};
        String[] isimler = {"Emre", "Hasan", "Ali"};

        for (int satir = 0; satir < borclar.length; satir++) {
            for (int sutun = 0; sutun < borclar[satir].length; sutun++) {

                int alacak = borclar[satir][sutun] - borclar[sutun][satir];
                if(alacak<0) {
                    if(satir != sutun)
                        System.out.println(isimler[satir] + " sahsi "+ isimler[sutun] + " sahsina borcu : " + Math.abs(alacak));
                }
            }
        }

    }

    private static void ikiBoyutluDiziOku(int[][] ikiBoyutluDizi) {
        for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
            for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
                System.out.println(satir + " satirin "+ sutun + " sutunundaki deger : " + ikiBoyutluDizi[satir][sutun]);
            }
        }

        System.out.println("**************************");
    }
}
