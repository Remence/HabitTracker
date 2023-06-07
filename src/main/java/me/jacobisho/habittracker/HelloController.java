package me.jacobisho.habittracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class HelloController {

    public Button loginButton;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField nameTextField;
    @FXML
    private Button exitButton;
    @FXML
    private AnchorPane loginScreen;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label dateLabel;

    @FXML
    protected void login(ActionEvent event) throws IOException {

        String username = nameTextField.getText();
        LocalDate myDate = datePicker.getValue();
        System.out.println(myDate.toString());


        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("weeks.fxml")));
        root = loader.load();

        WeeksController weeksController = loader.getController();
        weeksController.displayName(username);
        weeksController.setDate(myDate.toString());

//        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("weeks.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("How are you meant to keep up with your habits?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) loginScreen.getScene().getWindow();
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            System.out.println("(!) DEBUGGING - LOGGED OUT - " + stage.getTitle());
            stage.close();
        }
    }

    public void getDate(ActionEvent event) throws IOException {
        LocalDate myDate = datePicker.getValue();
        System.out.println(myDate.toString());
    }
}