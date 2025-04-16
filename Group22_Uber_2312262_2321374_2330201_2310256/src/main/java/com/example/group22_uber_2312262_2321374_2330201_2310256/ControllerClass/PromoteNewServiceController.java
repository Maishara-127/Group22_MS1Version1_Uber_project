package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.Promotion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PromoteNewServiceController {

    @FXML
    private TextField promotionNameTextField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextArea termsTextArea;
    @FXML
    private Label statusLabel;

    @FXML
    public void createPromotionButtonOnAction(ActionEvent actionEvent) {
        String promotionName = promotionNameTextField.getText();
        String description = descriptionTextArea.getText();
        String terms = termsTextArea.getText();

        if (promotionName.isEmpty() || description.isEmpty() || terms.isEmpty()) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }

        MarketingExecutive marketingExecutive = new MarketingExecutive();

        Promotion promotion = marketingExecutive.promoteNewService(promotionName, description);

        if (promotion != null) {
            statusLabel.setText("Promotion created successfully!");
        } else {
            statusLabel.setText("Something went wrong. Please try again.");
        }

    }    @FXML
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
