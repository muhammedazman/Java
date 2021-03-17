package com.muhammedazman;

import com.jfoenix.controls.JFXProgressBar;
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
}

// Tast used for Background-Process
class GetAllSingers extends Task {

    @Override
    protected ObservableList<Sarkici> call() throws Exception {
        System.out.println("Thread: "+ Thread.currentThread().getName());
        Thread.sleep(2000);

        // to cast ObservableList from ArrayList
        return FXCollections.observableArrayList(DataSource.getInstance().allSingers(DataSource.ORDER_DESC));
    }
}