package com.muhammedazman.model;

import java.sql.*;
import java.util.ArrayList;

// Veritabanlari ile ilgili tum islemleri burdan takip edecegiz
public class DataSource {

    public static final String DB_NAME = "muzik.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:"+DB_NAME;

    // Album Tablosu
    public static final String TABLO_ALBUM = "album";
    public static final String SUTUN_ALBUM_ID = "albumID";
    public static final String SUTUN_ALBUM_ADI = "albumAdi";
    public static final String SUTUN_ALBUM_SARKICI_ID = "sarkiciID";

    //Sarkici Tablosu
    public static final String TABLO_SARKICI = "sarkici";
    public static final String SUTUN_SARKICI_ID = "sarkiciID";
    public static final String SUTUN_SARKICI_ADI = "sarkiciAdi";

    //Sarki Tablosu
    public static final String TABLO_SARKI = "sarki";
    public static final String SUTUN_SARKI_ID = "sarkiID";
    public static final String SUTUN_SARKI_ADI = "sarkiAdi";
    public static final String SUTUN_SARKI_ALBUM_ID = "albumID";

    private Connection connection;

    public boolean connectDB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException throwables) {
            System.out.println("Veritabanina baglanilamadi!!!");
            return false;
        }
    }

    public void closeDB() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Sarkici> allSingers() {
        try (Statement statement = connection.createStatement()) {
            ResultSet query = statement.executeQuery("SELECT * FROM " + TABLO_SARKICI);
            ArrayList<Sarkici> singers = new ArrayList<>();
            while (query.next()) {
                Sarkici sarkici = new Sarkici();
                sarkici.setSarkiciID(query.getInt(SUTUN_SARKICI_ID));
                sarkici.setSarkiciAdi(query.getString(SUTUN_SARKICI_ADI));
                singers.add(sarkici);
            }
            return singers;
        } catch (SQLException e) {
            System.out.println("Sarkici Sorgusu Basarisiz");
            return null;
        }
    }
}
