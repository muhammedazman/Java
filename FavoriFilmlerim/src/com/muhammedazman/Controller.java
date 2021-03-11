package com.muhammedazman;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;

public class Controller {

    @FXML
    private BorderPane anaPencere;

    @FXML
    public void filmEkleDialog(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(anaPencere.getScene().getWindow());
    }

    @FXML
    public void uygulamayiKapat(ActionEvent actionEvent) {
        Platform.exit();
    }
}
