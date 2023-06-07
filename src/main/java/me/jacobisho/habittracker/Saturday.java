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

public class Saturday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label satFirstLabel;
    private Label satSecondLabel;
    private Label satThirdLabel;
    private Label satFourthLabel;
    private Label satFifthLabel;
    @FXML
    private TextField satFirstField;
    private TextField satSecondField;
    private TextField satThirdField;
    private TextField satFourthField;
    private TextField satFifthField;
    @FXML
    private Button satFirstSubmit;
    private Button satSecondSubmit;
    private Button satThirdSubmit;
    private Button satFourthSubmit;
    private Button satFifthSubmit;

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
        satFirstLabel.setText(satFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        satSecondLabel.setText(satSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        satThirdLabel.setText(satThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        satFourthLabel.setText(satFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        satFifthLabel.setText(satFifthField.getText());
    }

    @FXML
    private ProgressBar satProgressBar;
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
        satProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            satProgressBar.setProgress(progress);
        }

        if (satProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}

