package com.company.metot_dizi_string.sorucozumleri;

public class Cozum4 {

    /**
     * Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
     * Ekok(s1,s2) * ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde bulunuz
     * */
    public static void main(String[] args) {

        int birinciSayi = 45, ikinciSayi = 15;

        int ekok = ekokBul1(birinciSayi, ikinciSayi);
        System.out.println(birinciSayi + " ile " + ikinciSayi + " ekok1 degeri: " + ekok);

        int ebob = ebobBul(birinciSayi, ikinciSayi);
        System.out.println(birinciSayi + " ile " + ikinciSayi + " ebob degeri: " + ebob);

        int ekok2 = ekokBul2(birinciSayi, ikinciSayi);
        System.out.println(birinciSayi + " ile " + ikinciSayi + " ekok2 degeri: " + ekok2);
    }

    private static int ebobBul(int birinciSayi, int ikinciSayi) {
        int ebob = 1, kontrol = 2;

        while (kontrol <= birinciSayi && kontrol <= ikinciSayi) {
            if (birinciSayi % kontrol == 0 && ikinciSayi % kontrol == 0) {
                ebob = kontrol;
            }

            kontrol++;
        }

        if (ebob == 1) {
            System.out.println(birinciSayi + " ve " + ikinciSayi + " aralarinda asaldir.");
        }

        return ebob;
    }

    private static int ekokBul2(int birinciSayi, int ikinciSayi) {
        return (birinciSayi * ikinciSayi) / ebobBul(birinciSayi, ikinciSayi);
    }

    private static int ekokBul1(int birinciSayi, int ikinciSayi) {

        int buyuk = Math.max(birinciSayi, ikinciSayi);
        int ekok = 0;

        for (int i = buyuk; i <= birinciSayi*ikinciSayi ; i++) {

            if (i%birinciSayi == 0 && i%ikinciSayi == 0) {
                ekok = i;
                break;
            }
        }

        return ekok;
    }
}
