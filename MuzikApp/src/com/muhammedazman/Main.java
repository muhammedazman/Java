package com.muhammedazman;

import com.muhammedazman.model.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.connectDB();
        dataSource.closeDB();
    }
}
