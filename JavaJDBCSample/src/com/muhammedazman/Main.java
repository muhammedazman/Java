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
            /*
            statement.execute("UPDATE kisiler SET isim='ali' WHERE isim='hasan'");

            int etkilenenKayitSayisi = statement.executeUpdate("UPDATE kisiler SET isim='muhammed2' WHERE isim='muhammed'");
            System.out.println("Güncellenen kayit sayisi: "+etkilenenKayitSayisi);

            int silinenKayitSayisi = statement.executeUpdate("DELETE FROM kisiler WHERE isim='ali'");
            System.out.println("Silinen kayit sayisi: "+silinenKayitSayisi);
            */
            connection.commit();

            ResultSet sorguSonucu = statement.executeQuery("SELECT * FROM kisiler");

            while (sorguSonucu.next()){
                System.out.printf("Sonuclar %s - %s%n",
                        sorguSonucu.getString("isim"), sorguSonucu.getString("email"));
            }

            // sorguyu hazirliyoruz ama parametrelerini vermiyoruz
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM kisiler WHERE isim = ? AND email = ?");
            preparedStatement.setString(1, "muhammed");
            preparedStatement.setString(2, "vmazman@parametre.com");
            ResultSet sonuc = preparedStatement.executeQuery();

            System.out.println("************************************");
            while (sonuc.next()){
                System.out.printf("Sonuclar %s - %s%n",
                        sonuc.getString("isim"), sonuc.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
