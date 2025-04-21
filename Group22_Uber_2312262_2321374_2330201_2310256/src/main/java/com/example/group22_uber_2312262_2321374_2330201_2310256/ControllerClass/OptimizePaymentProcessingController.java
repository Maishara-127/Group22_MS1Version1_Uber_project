package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OptimizePaymentProcessingController {
    @FXML
    private CheckBox instantRefundCheckbox;

    @FXML
    private Label statusLabel;

    @FXML
    public void saveSettingButtonOnAction() {
        boolean isChecked = instantRefundCheckbox.isSelected();
        SystemAdministrator systemAdministrator = new SystemAdministrator("admin", 123, "admin@uber.com", "1234567890");
        String result = systemAdministrator.optimizePaymentProcessing(isChecked);
        statusLabel.setText(result);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/registeredDriverPassengerView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Maintain Customer and Driver Support System");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Failed to load page " + " Error: " + e.getMessage());
            alert.showAndWait();
        }
    }
}
