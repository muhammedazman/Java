package com.muhammedazman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db")) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE kisiler(isim TEXT, email TEXT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
