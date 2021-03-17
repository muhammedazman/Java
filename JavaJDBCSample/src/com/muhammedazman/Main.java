package com.muhammedazman;

import java.sql.*;

public class Main {

    public static void main(String[] args) {


        /*try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE kisiler(isim TEXT, email TEXT)");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        // autocloseable ile close metodlarini kullanmamanin yontemi
        // close metodlarini cagirmamam gerek kalmadi
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
             Statement statement = connection.createStatement();)
        {
            connection.setAutoCommit(false);
            statement.execute("CREATE TABLE IF NOT EXISTS kisiler(isim TEXT, email TEXT)");
            statement.execute("INSERT INTO kisiler(isim, email) VALUES('muhammed', 'vmazman@xxxx.com')");
            statement.execute("INSERT INTO kisiler(isim, email) VALUES('hasan', 'hasan@xxxx.com')");
            connection.commit();

            ResultSet sorguSonucu = statement.executeQuery("SELECT * FROM kisiler");

            while (sorguSonucu.next()){
                System.out.printf("Sonuclar %s - %s%n",
                        sorguSonucu.getString("isim"), sorguSonucu.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
