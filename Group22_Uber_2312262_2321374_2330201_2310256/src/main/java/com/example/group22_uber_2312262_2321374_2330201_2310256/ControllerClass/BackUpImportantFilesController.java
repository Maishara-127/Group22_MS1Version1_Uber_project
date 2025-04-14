package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;


public class BackUpImportantFilesController {

    @FXML
    private Label selectFileLabel;
    @FXML
    private Button chooseFileButtonFxId;
    @FXML
    private Button startBackupButtonFxId1;
    @FXML
    private Label statusLabel;

    private File selectedFile;

    @FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text_Files", "*.txt"));
        Stage stage = (Stage) chooseFileButtonFxId.getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            selectFileLabel.setText("File Selected: " + selectedFile.getName());
        } else {
            selectFileLabel.setText("No file selected.");
        }
    }

    @FXML
    public void startBackupButtonOnAction(ActionEvent actionEvent) {
        if (selectedFile != null) {
            try (FileWriter writer = new FileWriter("backup_" + selectedFile.getName())) {
                writer.write("Backup of: " + selectedFile.getName());
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Backup file");
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
                File file = fileChooser.showSaveDialog(new Stage());
                statusLabel.setText("Backup completed successfully!");
            } catch (Exception e) {
                statusLabel.setText("Something Error!");
            }
        } else {
            statusLabel.setText("Please select a file first!");
        }
    }

    @FXML
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
