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

public class Wednesday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label wedFirstLabel;
    private Label wedSecondLabel;
    private Label wedThirdLabel;
    private Label wedFourthLabel;
    private Label wedFifthLabel;
    @FXML
    private TextField wedFirstField;
    private TextField wedSecondField;
    private TextField wedThirdField;
    private TextField wedFourthField;
    private TextField wedFifthField;
    @FXML
    private Button wedFirstSubmit;
    private Button wedSecondSubmit;
    private Button wedThirdSubmit;
    private Button wedFourthSubmit;
    private Button wedFifthSubmit;

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
        wedFirstLabel.setText(wedFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        wedSecondLabel.setText(wedSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        wedThirdLabel.setText(wedThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        wedFourthLabel.setText(wedFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        wedFifthLabel.setText(wedFifthField.getText());
    }

    @FXML
    private ProgressBar wedProgressBar;
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
        wedProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            wedProgressBar.setProgress(progress);
        }

        if (wedProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}

