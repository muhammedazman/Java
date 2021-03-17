package com.muhammedazman;

import com.muhammedazman.model.DataSource;
import com.muhammedazman.model.Sarkici;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.connectDB();

        ArrayList<Sarkici> singers = dataSource.allSingers();

        if (singers == null) {
            System.out.println("Sarkici Bilgisi Yoktur!");
            return;
        }

        for (Sarkici singer : singers) {
            System.out.println("SARKICI ID:"+singer.getSarkiciID() + " ADI:"+singer.getSarkiciAdi());
        }

        dataSource.closeDB();
    }
}
