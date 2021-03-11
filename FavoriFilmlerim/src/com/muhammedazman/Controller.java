package com.muhammedazman;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ContextMenu listeSilMenusu;

    @FXML
    private BorderPane anaPencere;

    @FXML
    private ListView<Film> filmListesi;

    @FXML
    private Label cikisTarihiLabel;

    @FXML
    private TextArea textAreaDetay;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listeSilMenusu = new ContextMenu();
        MenuItem filmSilItem = new MenuItem("Filmi Listeden Kaldir");
        filmSilItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Film silinecekFilm = filmListesi.getSelectionModel().getSelectedItem();
                seciliFilmiSil(silinecekFilm);
            }
        });

        listeSilMenusu.getItems().add(filmSilItem);

        filmListesi.setItems(FilmData.getInstance().getFilmListesi());
        textAreaDetay.setEditable(false);
        filmListesi.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
            @Override
            public void changed(ObservableValue<? extends Film> observableValue, Film film, Film t1) {
                Film secilenFilm = filmListesi.getSelectionModel().getSelectedItem();
                textAreaDetay.setText(secilenFilm.getDetay());
                cikisTarihiLabel.setText(secilenFilm.getCikisTarihi().format(FilmData.getInstance().getFormatter()));
            }
        });

        filmListesi.getSelectionModel().selectFirst();

        filmListesi.setCellFactory(new Callback<ListView<Film>, ListCell<Film>>() {
            @Override
            public ListCell<Film> call(ListView<Film> filmListView) {

                ListCell<Film> yeniFilmListesi = new ListCell<>(){
                    @Override
                    protected void updateItem(Film film, boolean empty) {
                        super.updateItem(film, empty);

                        if (empty || film == null) {
                            setText(null);
                        } else {
                            setText(film.getBaslik());
                            if (film.getBaslik().substring(0,1).equalsIgnoreCase("g")) {
                                setTextFill(Color.GREEN);
                            } else setTextFill(Color.RED);
                        }
                    }
                };
                //context menu ekleniyor
                yeniFilmListesi.setContextMenu(listeSilMenusu);
                return yeniFilmListesi;
            }
        });
    }

    private void seciliFilmiSil(Film silinecekFilm) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Emin misiniz?");
        alert.setHeaderText("Silinecek Film: "+silinecekFilm.getBaslik());

        Optional<ButtonType> sonuc = alert.showAndWait();
        if (sonuc.get() == ButtonType.OK) {
            FilmData.getInstance().filmSil(silinecekFilm);
        }
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
