package com.muhammedazman;

import com.muhammedazman.model.DataSource;
import com.muhammedazman.model.Sarkici;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class Controller {

    @FXML
    private TableView tablo;

    @FXML
    private TableColumn getirilecekBilgi;

    public void getAllSingers() {
        GetAllSingers task = new GetAllSingers();
        tablo.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }
}

// Tast used for Background-Process
class GetAllSingers extends Task {

    @Override
    protected ObservableList<Sarkici> call() throws Exception {
        System.out.println("Thread: "+ Thread.currentThread().getName());

        // to cast ObservableList from ArrayList
        return FXCollections.observableArrayList(DataSource.getInstance().allSingers(DataSource.ORDER_DESC));
    }
}