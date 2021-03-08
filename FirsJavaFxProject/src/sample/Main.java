package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init blogu tetiklendi");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("start metotu");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop blogu");
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("main metotu");
        launch(args);
    }
}
