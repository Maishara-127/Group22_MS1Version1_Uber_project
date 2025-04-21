package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.EmailCampaign;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SendEmailCampaignController
{
    @javafx.fxml.FXML
    private ListView recipientsListView;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextArea bodyTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
        String subject = subjectTextField.getText();
        String body = bodyTextArea.getText();
        ArrayList<String> recipients = (ArrayList<String>) recipientsListView.getItems();

        MarketingExecutive marketingExecutive = new MarketingExecutive();
        EmailCampaign campaign = marketingExecutive.sendEmailCampaign(subject, body, recipients);

        if (campaign != null && campaign.isSent()) {
            String recipientText = " ";
            for (String recipient : recipients) {
                if (!recipientText.isEmpty()) {
                    recipientText += " ";
                }
                recipientText += recipient;
            }

            statusLabel.setText("Email sent to: " + recipientText);
        } else {
            statusLabel.setText("Please fill in all fields properly.");
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
