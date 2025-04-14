package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

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
        if (instantRefundCheckbox.isSelected()) {
            statusLabel.setText("Instant refund enabled.");
        } else {
            statusLabel.setText("Instant refund disabled.");
        }
    }

    @FXML
    public void testRefundButtonOnAction(ActionEvent actionEvent) {
        if (instantRefundCheckbox.isSelected()) {
            statusLabel.setText("Refund processed instantly.");
        } else {
            statusLabel.setText("Refund will be processed later.");
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/maintainCustomerAndDriverSupportSystemView.fxml"));
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
