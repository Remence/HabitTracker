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
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class Sunday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label sunFirstLabel;
    private Label sunSecondLabel;
    private Label sunThirdLabel;
    private Label sunFourthLabel;
    private Label sunFifthLabel;
    @FXML
    private TextField sunFirstField;
    private TextField sunSecondField;
    private TextField sunThirdField;
    private TextField sunFourthField;
    private TextField sunFifthField;
    @FXML
    private Button sunFirstSubmit;
    private Button sunSecondSubmit;
    private Button sunThirdSubmit;
    private Button sunFourthSubmit;
    private Button sunFifthSubmit;

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
        sunFirstLabel.setText(sunFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        sunSecondLabel.setText(sunSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        sunThirdLabel.setText(sunThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        sunFourthLabel.setText(sunFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        sunFifthLabel.setText(sunFifthField.getText());
    }

    @FXML
    private ProgressBar sunProgressBar;
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
        sunProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            sunProgressBar.setProgress(progress);
        }

        if (sunProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}
