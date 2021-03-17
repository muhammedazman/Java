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

    // Order By Option
    public static final int ORDER_ASC = 1;
    public static final int ORDER_DESC = 2;

    // Singelaton Design Pattern
    private DataSource(){}
    /*
    // bu kod thread safe degil
    private static DataSource instance;
    public static DataSource getInstance(){
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }
    */

    private static DataSource instance = new DataSource();
    public static DataSource getInstance(){
        return instance;
    }

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

    public ArrayList<Sarkici> allSingers(int siralama) {
        StringBuilder sqlQuery = new StringBuilder("SELECT * FROM ");
        sqlQuery.append(TABLO_SARKICI);

        if (siralama == ORDER_DESC) {
            sqlQuery.append(" ORDER BY ");
            sqlQuery.append(SUTUN_SARKICI_ADI);
            sqlQuery.append(" DESC ");
        } else {
            sqlQuery.append(" ORDER BY ");
            sqlQuery.append(SUTUN_SARKICI_ADI);
            sqlQuery.append(" ASC ");
        }

        try (Statement statement = connection.createStatement()) {
            ResultSet query = statement.executeQuery(String.valueOf(sqlQuery));
            ArrayList<Sarkici> singers = new ArrayList<>();
            while (query.next()) {
                Sarkici sarkici = new Sarkici();
                sarkici.setSarkiciID(query.getInt(SUTUN_SARKICI_ID));
                sarkici.setSarkiciAdi(query.getString(SUTUN_SARKICI_ADI));
                singers.add(sarkici);
            }
            return singers;
        } catch (SQLException e) {
            System.out.println("Sarkici Sorgusu Basarisiz"+e.toString());
            return null;
        }
    }
}
