package com.example.group22_uber_2312262_2321374_2330201_2310256;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("logInPageview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Uber");
        stage.setScene(scene);
        stage.show();
    }

    public static void main() {
        launch();
    }
} //