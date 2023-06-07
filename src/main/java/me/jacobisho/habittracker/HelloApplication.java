package me.jacobisho.habittracker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Habit Tracker");
        stage.setScene(scene);
        stage.show();

        // lambda function
        stage.setOnCloseRequest(event -> {
            event.consume();
            logout(stage);
        });
    }

    public static void main(String[] args) {
        launch();
    }

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("How are you meant to keep up with your habits?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            stage.close();
        }
    }
}

// Image = photograph
// ImageView = picture frame