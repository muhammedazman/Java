package com.muhammedazman;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private JFXTextField email;

    @FXML
    private JFXPasswordField sifre;

    @FXML
    private JFXButton buton;

    @FXML
    private Label sonuc;

    @FXML
    void girisYap(ActionEvent event) {
        if (email.getText().equals("muhammed") && sifre.getText().equals("123456")) {
            sonuc.setText("Giris islemi basarili");
        } else {
            sonuc.setText("Giris islemi basarisiz!!");
        }
    }

}