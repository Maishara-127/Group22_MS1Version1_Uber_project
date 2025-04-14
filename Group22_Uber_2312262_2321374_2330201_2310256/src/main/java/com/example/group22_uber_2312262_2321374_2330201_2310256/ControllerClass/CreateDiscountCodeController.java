package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.DiscountCode;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
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

public class CreateDiscountCodeController {
    @javafx.fxml.FXML
    private TextField discountPercentageTextField;
    @javafx.fxml.FXML
    private TextField discountCodeTextField;
    @javafx.fxml.FXML
    private Label statusLabel;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    public void applyDiscountButtonOnAction(ActionEvent actionEvent) {
        String code = discountCodeTextField.getText();
        String percentStr = discountPercentageTextField.getText();

        if (code == null || code.isEmpty() || percentStr == null || percentStr.trim().isEmpty()) {
            statusLabel.setText("Please enter both code and percentage.");
            return;
        }

        try {
            float percentage = Float.parseFloat(percentStr);

            MarketingExecutive marketingExecutive = new MarketingExecutive();
            DiscountCode discount = marketingExecutive.createDiscountCode(code, percentage);

            if (discount == null) {
                statusLabel.setText("Invalid input. Percentage must be > 0 and ≤ 100.");
            } else {
                statusLabel.setText("Discount applied successfully.");
            }

        } catch (NumberFormatException e) {
            statusLabel.setText("Please enter a valid number for percentage.");
        }
    }    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/marketingExecutivePageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Marketing Executive");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Failed to load page. Error: " + e.getMessage());
            alert.showAndWait();
        }
    }
}
