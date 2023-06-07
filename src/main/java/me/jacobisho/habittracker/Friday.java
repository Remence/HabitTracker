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

public class Friday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label friFirstLabel;
    private Label friSecondLabel;
    private Label friThirdLabel;
    private Label friFourthLabel;
    private Label friFifthLabel;
    @FXML
    private TextField friFirstField;
    private TextField friSecondField;
    private TextField friThirdField;
    private TextField friFourthField;
    private TextField friFifthField;
    @FXML
    private Button friFirstSubmit;
    private Button friSecondSubmit;
    private Button friThirdSubmit;
    private Button friFourthSubmit;
    private Button friFifthSubmit;

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
        friFirstLabel.setText(friFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        friSecondLabel.setText(friSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        friThirdLabel.setText(friThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        friFourthLabel.setText(friFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        friFifthLabel.setText(friFifthField.getText());
    }

    @FXML
    private ProgressBar friProgressBar;
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
        friProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            friProgressBar.setProgress(progress);
        }

        if (friProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}

