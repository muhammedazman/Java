package com.muhammedazman;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

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
