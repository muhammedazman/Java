package com.company.bolum_13_collections_project.sansli_on_numara;

import java.util.*;

public class Main {

    /**
     * sansli 10 numarayi bulan uygulamayi yaziniz
     * 1 den 60 a kadar sayilari 1.000.000 kere olusturunuz
     * Bu sayilari bir map icersinde anahtar=sayi deger=kac kere olacak sekilde listeye saklayiniz
     * sonrasinda bu islem bittikten sonra bu sayilari tekrar etme sayisina gore bir listeye aktariniz
     * sonra yine rastgele olacak sekilde bir set yapisi kullanarak kücükten büyüge dogru ilk 10 sayiyi ekrana bastiriniz
     * */

    static final int URETILECEK_SAYI_MAX_SINIR = 60;
    static final int URETILECEK_SAYI_MIKTARI = 1000000;

    public static void main(String[] args) {
        Map<Integer, Integer> olusturulanSayilarMap = new HashMap<>();
        List<Integer> olusuturulanSayiListesi = new ArrayList<>();
        Set<Integer> sansliOnSayi = new TreeSet<>();//sirali olarak gosterilmesini istedigimiz icin TreeSet kullandik

        mapiSayilarlaDoldur(olusturulanSayilarMap);
        mapiListeyeYazdir(olusturulanSayilarMap, olusuturulanSayiListesi);

        sansliOnSayisiBul(sansliOnSayi, olusuturulanSayiListesi);

        System.out.println("Listenin size deger: "+olusuturulanSayiListesi.size());
        System.out.println("Map size degeri: "+olusturulanSayilarMap.size());
        System.out.println("Sansli On Sayi size degeri: "+sansliOnSayi.size());

        for (int gecici:sansliOnSayi){
            System.out.print(gecici+ " ");
        }
    }

    private static void sansliOnSayisiBul(Set<Integer> sansliOnSayi, List<Integer> olusuturulanSayiListesi) {
        Collections.shuffle(olusuturulanSayiListesi);

        while (sansliOnSayi.size() < 10) {
            int randomSayi = (int) (Math.random() * URETILECEK_SAYI_MIKTARI);
            sansliOnSayi.add(olusuturulanSayiListesi.get(randomSayi));
        }
    }

    private static void mapiListeyeYazdir(Map<Integer, Integer> olusturulanSayilarMap, List<Integer> olusuturulanSayiListesi) {
        for (Map.Entry<Integer, Integer> tempMap:olusturulanSayilarMap.entrySet()) {

            int key = tempMap.getKey();//9
            int value = tempMap.getValue();//15 bu 9 sayisinin 15 kere olusturuldugu anlamina gelir

            for (int i = 0; i <  value; i++) {
                olusuturulanSayiListesi.add(key);
            }
        }
    }

    private static void mapiSayilarlaDoldur(Map<Integer, Integer> olusturulanSayilarMap) {
        for (int i = 0; i < URETILECEK_SAYI_MIKTARI; i++) {
            int randomSayi = sayilOlustur();

            if (olusturulanSayilarMap.containsKey(randomSayi)) {
                int keyValue = olusturulanSayilarMap.get(randomSayi);
                olusturulanSayilarMap.put(randomSayi, ++keyValue);
            } else {
                olusturulanSayilarMap.put(randomSayi,1);
            }
        }
    }

    private static int sayilOlustur(){
        return ((int) (Math.random() * URETILECEK_SAYI_MAX_SINIR) + 1);
    }
}