package com.company.bolum_9_sorular;

public class HaberKanali extends Kanal {

    private String haberTuru;

    public HaberKanali(String adi, int kanalNo, String haberTuru) {
        super(adi, kanalNo);
        this.haberTuru = haberTuru;
    }
}
