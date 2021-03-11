package com.muhammedazman;


import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.time.LocalDate;

public class YeniFilmController {

    @FXML
    private JFXTextField txtFilmAdi;

    @FXML
    private JFXTextArea txtFilmDetay;

    @FXML
    private JFXDatePicker dateCikisTarihi;

    // listeye Film ekler
    public Film yeniNotuEkle() {
        String filmAdi = txtFilmAdi.getText();
        String filmDetay = txtFilmDetay.getText();
        LocalDate filmCikisTaihi = dateCikisTarihi.getValue();

        Film eklenecekFilm = new Film(filmAdi, filmDetay, filmCikisTaihi);
        FilmData.getInstance().filmEkle(eklenecekFilm);
        return eklenecekFilm;
    }

}
