package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class BackUpImportantFilesController
{
    @javafx.fxml.FXML
    private javafx.scene.control.Label selectFileLabel;
    @javafx.fxml.FXML
    private Button chooseFileButtonFxId;
    @javafx.fxml.FXML
    private Button startBackupButtonFxId1;
    @javafx.fxml.FXML
    private javafx.scene.control.Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    File selectedFile = null;
    @javafx.fxml.FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
        File f = null;
        FileChooser fc = new FileChooser();
        try {
            f = fc.showOpenDialog(null);
            if (f != null) {
                selectedFile = f;
                selectFileLabel.setText(f.getName());
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @javafx.fxml.FXML
    public void startBackupButtonOnAction(ActionEvent actionEvent) {
        File f = null;
        FileChooser fc = new FileChooser();
        try {
            f = fc.showSaveDialog(null);
            if (f != null) {
                SystemAdministrator systemAdministrator = new SystemAdministrator("Arpy", 111, "System Administrator", "Arpy@uber.com");
                systemAdministrator.backupImportantFile(selectedFile);
                statusLabel.setText("Backup successful!");
            } else {
                statusLabel.setText("No file selected.");
            }
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());

        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/systemAdministratorPageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("System Administrator");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Failed to load page " + "Error: " + e.getMessage());
            alert.showAndWait();

        }
    }
}