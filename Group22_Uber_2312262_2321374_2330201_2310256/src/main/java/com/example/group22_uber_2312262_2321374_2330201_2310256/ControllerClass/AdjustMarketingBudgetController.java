package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.EngagementBudget;
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

public class AdjustMarketingBudgetController {
    @FXML
    private TextField digitalAddsBudgetTextField;
    @FXML
    private TextField promotionBudgetTextField;
    @FXML
    private Label statusLabel;

    @FXML
    public void appyNewBudgetButtonOnAction(ActionEvent actionEvent) {
        String digitalAdsInput = digitalAddsBudgetTextField.getText();
        String promotionsInput = promotionBudgetTextField.getText();

        try {
            double digitalAdsValue = Double.parseDouble(digitalAdsInput);
            double promotionsValue = Double.parseDouble(promotionsInput);

            EngagementBudget newBudget = new EngagementBudget(digitalAdsValue, promotionsValue);

            statusLabel.setText("Budget has been successfully updated!");
            digitalAddsBudgetTextField.clear();
            promotionBudgetTextField.clear();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please enter valid number.");
            alert.showAndWait();
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/marketingExecutivePageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
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

