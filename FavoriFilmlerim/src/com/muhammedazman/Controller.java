package com.muhammedazman;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private BorderPane anaPencere;

    @FXML
    private ListView<Film> filmListesi;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        filmListesi.setItems(FilmData.getInstance().getFilmListesi());
    }

    // dialogdan apply butonu tiklanildigi zaman calisir
    @FXML
    public void filmEkleDialog(ActionEvent actionEvent) throws IOException {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(anaPencere.getScene().getWindow());

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("yeniFilmDialog.fxml"));

        dialog.setTitle("Yeni Film Ekle");
        dialog.getDialogPane().setContent(loader.load());

        dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> sonuc = dialog.showAndWait();

        if (sonuc.get() == ButtonType.APPLY) {
            YeniFilmController dialogController = loader.getController();
            Film eklenenFilm = dialogController.yeniNotuEkle();

            filmListesi.getSelectionModel().select(eklenenFilm);
        } else {
            System.out.println("Cancel tiklanildi");
        }
    }

    @FXML
    public void uygulamayiKapat(ActionEvent actionEvent) {
        Platform.exit();
    }
}
