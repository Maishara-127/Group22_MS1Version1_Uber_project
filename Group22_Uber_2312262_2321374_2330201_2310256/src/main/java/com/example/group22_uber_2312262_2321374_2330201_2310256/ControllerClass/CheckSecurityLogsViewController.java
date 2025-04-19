package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckSecurityLogsViewController {

    @FXML
    private TextField filterCriteriaTextField;
    @FXML
    private Label logsLabel;
    @FXML
    private Label statusLabel;

    private SystemAdministrator systemAdministrator = new SystemAdministrator("Admin", 1, "System Admin", "admin@uber.com");

    @FXML
    public void openSecurityLogButtonOnAction(ActionEvent actionEvent) {
        String logs = systemAdministrator.checkSecurityLogs(null); // No criteria for fetching all logs
        logsLabel.setText(logs);
        statusLabel.setText("Logs fetched.");
    }

    @FXML
    public void filterLogsButtonOnAction(ActionEvent actionEvent) {
        String criteria = filterCriteriaTextField.getText();
        String filteredLogs = systemAdministrator.checkSecurityLogs(criteria);
        logsLabel.setText(filteredLogs);
        statusLabel.setText("Logs filtered.");
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
