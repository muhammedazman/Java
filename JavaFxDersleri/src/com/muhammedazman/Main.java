package com.muhammedazman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        BorderPane rootNode = loader.load();

        Scene scene = new Scene(rootNode, 600, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Merhaba Java Fx");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}