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

public class Thursday implements Initializable {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label thursFirstLabel;
    private Label thursSecondLabel;
    private Label thursThirdLabel;
    private Label thursFourthLabel;
    private Label thursFifthLabel;
    @FXML
    private TextField thursFirstField;
    private TextField thursSecondField;
    private TextField thursThirdField;
    private TextField thursFourthField;
    private TextField thursFifthField;
    @FXML
    private Button thursFirstSubmit;
    private Button thursSecondSubmit;
    private Button thursThirdSubmit;
    private Button thursFourthSubmit;
    private Button thursFifthSubmit;

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
        thursFirstLabel.setText(thursFirstField.getText());
    }

    public void secondSubmit(ActionEvent event) {
        thursSecondLabel.setText(thursSecondField.getText());
    }

    public void thirdSubmit(ActionEvent event) {
        thursThirdLabel.setText(thursThirdField.getText());
    }

    public void fourthSubmit(ActionEvent event) {
        thursFourthLabel.setText(thursFourthField.getText());
    }

    public void fifthSubmit(ActionEvent event) {
        thursFifthLabel.setText(thursFifthField.getText());
    }

    @FXML
    private ProgressBar thursProgressBar;
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
        thursProgressBar.setProgress(0.0);
    }

    public void increaseProgress() {
        if (firstCheck.isSelected() || secondCheck.isSelected() || thirdCheck.isSelected() || fourthCheck.isSelected() || fifthCheck.isSelected()) {
            progress += 0.2;
            thursProgressBar.setProgress(progress);
        }

        if (thursProgressBar.getProgress() >= 1.0) {
            backdrop.setStyle("-fx-background-color: lime");
        }
    }
}

