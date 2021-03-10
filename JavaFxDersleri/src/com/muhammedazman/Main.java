package com.muhammedazman;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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

        //Scene Builder dan gelen ekran
        Scene scene = new Scene(rootNode, 600, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Merhaba Java Fx");
        stage.show();

        //scene1 yukaridaki ekrani ezecektir
        //stackpane elemanlari tam orta ve üst üste yerlestirir.
        //StackPane stackPane = new StackPane();

        //elemanlari yan yana dizmek icin
        HBox hBox = new HBox();
        Button tamamButton = new Button("Tamam");
        Button cikisButton = new Button("Cikis");
        hBox.getChildren().add(tamamButton);
        hBox.getChildren().add(cikisButton);


        //addEventListener
        tamamButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("tamam tiklanildi");
            }
        });


        cikisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("cikis butonu tiklanildi");
                System.exit(0);
            }
        });

        Scene scene1 = new Scene(hBox, 500,400);
        stage.setScene(scene1);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}