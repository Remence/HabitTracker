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

public class Monday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label monFirstLabel;
    @FXML
    private Label monSecondLabel;
    @FXML
    private Label monThirdLabel;
    @FXML
    private Label monFourthLabel;
    @FXML
    private Label monFifthLabel;
    @FXML
    private TextField monFirstField;
    @FXML
    private TextField monSecondField;
    @FXML
    private TextField monThirdField;
    @FXML
    private TextField monFourthField;
    @FXML
    private TextField monFifthField;
    @FXML
    private Button monFirstSubmit;
    @FXML
    private Button monSecondSubmit;
    @FXML
    private Button monThirdSubmit;
    @FXML
    private Button monFourthSubmit;
    @FXML
    private Button monFifthSubmit;

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
        monFirstLabel.setText(monFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        monSecondLabel.setText(monSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        monThirdLabel.setText(monThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        monFourthLabel.setText(monFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        monFifthLabel.setText(monFifthField.getText());
    }

    @FXML
    private ProgressBar monProgressBar;
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
        monProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            monProgressBar.setProgress(progress);
        }

        if (monProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}
