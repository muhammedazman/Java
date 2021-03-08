package com.company.bolum_14_exceptions.dosya_islemleri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Alistirmalar {

    public static void main(String[] args) {
        // istiklal marsinin 10 kitasini bir txt dosyasina kaydedip
        // sonrasinda bu dosyadaki tolam karakter, kelim ce stir sayisini gösteren uygulamayi yaziniz
        // en cok tekrar eden kelimeyi bulunuz.

        int toplamKarakterSayisi = 0;
        int toplamKelimeSayisi = 0;
        int toplamSatirSayisi = 0;
        HashMap<String, Integer> kelimeTekrarMap = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("istiklalmarsi.txt"))) {
            String oankiSatir = reader.readLine();

            while (oankiSatir != null) {

                toplamSatirSayisi++;

                String[] satirdakiKelimeDizisi = oankiSatir.toLowerCase().split(" ");
                toplamKelimeSayisi += satirdakiKelimeDizisi.length;

                for (String kelime:satirdakiKelimeDizisi) {

                    if (kelimeTekrarMap.containsKey(kelime)){
                        kelimeTekrarMap.put(kelime, kelimeTekrarMap.get(kelime)+1);
                    } else {
                        kelimeTekrarMap.put(kelime, 1);
                    }

                    toplamKarakterSayisi += kelime.length();
                }

                oankiSatir = reader.readLine();
            }

            System.out.println("Toplam Satir Sayisi = " + toplamSatirSayisi);
            System.out.println("Toplam Kelime Sayisi = " + toplamKelimeSayisi );
            System.out.println("Toplam Karakter Sayisi = " + toplamKarakterSayisi );

            int tekrarSayisi = 0;
            String enCokTekrarEdenKelime = null;

            for (Map.Entry entry:kelimeTekrarMap.entrySet()) {
                if (Integer.parseInt(entry.getValue().toString()) > tekrarSayisi && !entry.getKey().equals("")) {
                    enCokTekrarEdenKelime = entry.getKey().toString();
                    tekrarSayisi= (int) entry.getValue();
                }
            }

            System.out.println("en cok tekrar eden kelime: "+ enCokTekrarEdenKelime+" sayi: "+ tekrarSayisi);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
