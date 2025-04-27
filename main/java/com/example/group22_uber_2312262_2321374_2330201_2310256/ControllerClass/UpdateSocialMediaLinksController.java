package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpdateSocialMediaLinksController {

    @FXML
    private TextField urlTextField;

    @FXML
    private ComboBox<String> selectPlatformCombobox;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {
        selectPlatformCombobox.getItems().addAll("Facebook", "Instagram", "Twitter");
        selectPlatformCombobox.setValue("Facebook");
    }

    @FXML
    public void updateUrlButtonOnAction(ActionEvent actionEvent) {
        String platform = selectPlatformCombobox.getValue();
        String url = urlTextField.getText();
        MarketingExecutive marketingExecutive = new MarketingExecutive();
        boolean isValid = marketingExecutive.updateSocialMediaLink(url);

        if (isValid) {
            statusLabel.setText("URL updated successfully!");
        } else {
            statusLabel.setText("Invalid URL! Please enter a valid URL.");
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
            alert.setContentText("Failed to load page: " + e.getMessage());
            alert.showAndWait();
        }
    }
}
