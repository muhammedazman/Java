package com.muhammedazman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        FilmData.getInstance().dosyadanFilmleriGetir();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Favori Filmlerim");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        /*LocalDate localDate = LocalDate.now();
        Film film = new Film("Gora", "Cem Yilmaz Filmi", localDate);
        FilmData.getInstance().filmEkle(film);
        FilmData.getInstance().filmEkle(film);
        FilmData.getInstance().dosyayaFilmleriYaz();*/
        super.stop();
    }
}
