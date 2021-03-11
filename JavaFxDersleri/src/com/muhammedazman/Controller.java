package com.muhammedazman;

import com.jfoenix.controls.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;

public class Controller {


    @FXML
    private JFXTextField txtAd;

    @FXML
    private JFXButton btnMerhaba;

    @FXML
    private JFXButton btnHoscakal;

    @FXML
    private JFXCheckBox checkBox;

    @FXML
    private JFXListView<String> listView;

    @FXML
    private JFXTextArea textArea;

    @FXML
    public void initialize() {
        btnMerhaba.setDisable(true);
        btnHoscakal.setDisable(true);

        listView.getItems().addAll("Domates", "Sucuk", "Peynir", "Zeytin", "Misir");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @FXML
    public void listeElemanlariniTasi(ActionEvent event) {
        String textAreaMetni = "";
        ObservableList<String> secilenler = listView.getSelectionModel().getSelectedItems();
        System.out.println(secilenler);

        for (String gecici:secilenler) {
            textAreaMetni += gecici+"\n";
        }
        textArea.setText(textAreaMetni);
    }

    @FXML
    public void checkBoxSecildi(ActionEvent actionEvent) {
        System.out.println("CheckBox: "+ checkBox.isSelected());
    }

    @FXML
    public void textGirildi(KeyEvent keyEvent) {
        String isim = txtAd.getText();

        boolean butonlariDisableEt = isim.isEmpty() ? true : false;
        btnMerhaba.setDisable(butonlariDisableEt);
        btnHoscakal.setDisable(butonlariDisableEt);
    }

    @FXML
    public void calistir(ActionEvent event) {
        String isim = txtAd.getText();

        if (event.getSource().equals(btnMerhaba)) {
            System.out.println("Merhaba "+ isim);
        } else {
            System.out.println("Hoscakal "+ isim);
        }

        if (checkBox.isSelected()) {
            txtAd.clear();
            btnMerhaba.setDisable(true);
            btnHoscakal.setDisable(true);
        }
    }

    @FXML
    public void beniTiklaMetotu(ActionEvent actionEvent){
        String butonYazisi = ((Button)(actionEvent.getSource())).getText();
        if (butonYazisi.equalsIgnoreCase("beni tikla")) {
            System.out.println("birinci buton tiklanildi");
        } else if (butonYazisi.equalsIgnoreCase("merhaba")) {
            System.out.println("ikinci buton tiklanildi");
        } else if (butonYazisi.equalsIgnoreCase("selam")) {
            System.out.println("ucuncu buton tiklanildi");
        }
    }
}
