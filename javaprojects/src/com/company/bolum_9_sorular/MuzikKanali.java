package com.company.bolum_9_sorular;

public class MuzikKanali extends Kanal{

    private String muzikTuru;

    public MuzikKanali(String adi, int kanalNo, String muzikTuru) {
        super(adi, kanalNo);
        this.muzikTuru = muzikTuru;
    }
}
