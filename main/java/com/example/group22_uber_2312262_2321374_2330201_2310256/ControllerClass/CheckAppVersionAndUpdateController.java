package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.CheckAppVersion;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CheckAppVersionAndUpdateController {
    @FXML
    private Label versionLabel;

    @FXML
    private Label statusLabel;


    private CheckAppVersion checkAppVersion;

    public CheckAppVersionAndUpdateController() {
        checkAppVersion = new CheckAppVersion();
    }

    @FXML
    public void initialize() {

        versionLabel.setText("Current Version: " + checkAppVersion.getCurrentVersion());
    }

    @FXML
    private SystemAdministrator systemAdministrator;

    @FXML
    public void checkUpdateButtonOnAction(ActionEvent actionEvent) {
        SystemAdministrator systemAdministrator = new SystemAdministrator("Arpy", 111, "System Administrator", "Arpy@uber.com");
        systemAdministrator.checkAppVersionAndUpdate();
        statusLabel.setText("Update check completed");
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
