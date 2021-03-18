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
                sarkici.setIsim(query.getString(SUTUN_SARKICI_ADI));
                singers.add(sarkici);
            }
            return singers;
        } catch (SQLException e) {
            System.out.println("Sarkici Sorgusu Basarisiz"+e.toString());
            return null;
        }
    }

    public ArrayList<Album> allSingersAlbums(int sarkiciID) {
        String sqlQuery = "SELECT * FROM " + TABLO_ALBUM + " WHERE "+SUTUN_ALBUM_SARKICI_ID + " = ? ";
        try (PreparedStatement statement = connection.prepareStatement(sqlQuery)){
            statement.setInt(1, sarkiciID);
            ResultSet resultSet =statement.executeQuery();

            ArrayList<Album> albums = new ArrayList<>();

            while (resultSet.next()) {
               Album album = new Album();
               album.setAlbumID(resultSet.getInt(SUTUN_ALBUM_ID));
               album.setIsim(resultSet.getString(SUTUN_ALBUM_ADI));
               album.setSarkiciID(resultSet.getInt(SUTUN_ALBUM_SARKICI_ID));
               albums.add(album);
            }

            return albums;
        } catch (SQLException e) {
            System.out.println("Singer's Album SQL not run");
            return null;
        }
    }

    public boolean updateSinger(Sarkici oldSinger, String newName) {
        String SQL = "UPDATE " + TABLO_SARKICI + " SET "+SUTUN_SARKICI_ADI +" = ?  WHERE " +SUTUN_SARKICI_ID + " = " + oldSinger.getSarkiciID();
        try (PreparedStatement statement = connection.prepareStatement(SQL)){
            statement.setString(1, newName);
            int result = statement.executeUpdate();
            return result==1;//true?
        } catch (SQLException e) {
            System.out.println("Singers Table not updated");
            return false;
        }


    }
}
