package com.muhammedazman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent loader = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene scene = new Scene(loader, 900, 600);
        stage.setScene(scene);
        stage.show();
    }
}
