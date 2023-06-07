package me.jacobisho.habittracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Tuesday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label tuesFirstLabel;
    private Label tuesSecondLabel;
    private Label tuesThirdLabel;
    private Label tuesFourthLabel;
    private Label tuesFifthLabel;
    @FXML
    private TextField tuesFirstField;
    private TextField tuesSecondField;
    private TextField tuesThirdField;
    private TextField tuesFourthField;
    private TextField tuesFifthField;
    @FXML
    private Button tuesFirstSubmit;
    private Button tuesSecondSubmit;
    private Button tuesThirdSubmit;
    private Button tuesFourthSubmit;
    private Button tuesFifthSubmit;

    @FXML
    protected void back(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("weeks.fxml")));
        root = loader.load();

//        WeeksController weeksController = loader.getController();

//        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("weeks.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void firstSubmit(ActionEvent event) {
        tuesFirstLabel.setText(tuesFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        tuesSecondLabel.setText(tuesSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        tuesThirdLabel.setText(tuesThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        tuesFourthLabel.setText(tuesFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        tuesFifthLabel.setText(tuesFifthField.getText());
    }

    @FXML
    private ProgressBar tuesProgressBar;
    double progress;
    @FXML
    private CheckBox firstCheck;
    private CheckBox secondCheck;
    private CheckBox thirdCheck;
    private CheckBox fourthCheck;
    private CheckBox fifthCheck;
    private AnchorPane backdrop;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tuesProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            tuesProgressBar.setProgress(progress);
        }

        if (tuesProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}

