package com.muhammedazman;

import com.jfoenix.controls.JFXProgressBar;
import com.muhammedazman.model.Album;
import com.muhammedazman.model.DataSource;
import com.muhammedazman.model.Sarkici;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableView tablo;

    @FXML
    private JFXProgressBar progressBar;

    @FXML
    public void getAllSingers() {
        GetAllSingers task = new GetAllSingers();
        tablo.itemsProperty().bind(task.valueProperty());
        progressBar.progressProperty().bind(task.progressProperty());
        progressBar.setVisible(true);

        task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent workerStateEvent) {
                System.out.println("Thread success: "+Thread.currentThread().getName());
                progressBar.setVisible(false);
            }
        });

        task.setOnFailed(event -> progressBar.setVisible(false));

        new Thread(task).start();
    }

    @FXML
    public void getSingersAlbums(){
        Sarkici selectedSinger = (Sarkici) tablo.getSelectionModel().getSelectedItem();

        if (selectedSinger == null){
            System.out.println("The Singer is not selected");
            return;
        }

        Task<ObservableList<Album>> task = new Task() {
            @Override
            protected ObservableList<Album> call() throws Exception {
                System.out.println("Thread Album: "+ Thread.currentThread().getName());
                return FXCollections.observableArrayList(DataSource.getInstance().allSingersAlbums(selectedSinger.getSarkiciID()));
            }
        };

        tablo.itemsProperty().bind(task.valueProperty());
        new Thread(task).start();
    }
}

// Tast used for Background-Process
class GetAllSingers extends Task {

    @Override
    protected ObservableList<Sarkici> call() throws Exception {
        System.out.println("Thread: "+ Thread.currentThread().getName());
        Thread.sleep(1000);

        // to cast ObservableList from ArrayList
        return FXCollections.observableArrayList(DataSource.getInstance().allSingers(DataSource.ORDER_DESC));
    }
}