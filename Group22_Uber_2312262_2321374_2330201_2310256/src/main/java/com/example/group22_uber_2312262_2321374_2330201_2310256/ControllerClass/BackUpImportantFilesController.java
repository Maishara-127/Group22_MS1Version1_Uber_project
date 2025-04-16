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
import java.util.Scanner;


public class BackUpImportantFilesController {

    @FXML
    private Label selectFileLabel;
    @FXML
    private Button chooseFileButtonFxId;
    @FXML
    private Button startBackupButtonFxId1;
    @FXML
    private Label statusLabel;


    @FXML
    public void chooseFileButtonOnAction(ActionEvent actionEvent) {
        File f = null;
        FileChooser fc = null;
        Scanner sc = null;

        try {
            fc = new FileChooser();
            f = fc.showOpenDialog(null);
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);

            }
        } catch (Exception e) {

        }
    }

    @FXML
    public void startBackupButtonOnAction(ActionEvent actionEvent) {

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