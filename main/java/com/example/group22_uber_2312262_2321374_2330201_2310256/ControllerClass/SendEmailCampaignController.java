package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.EmailCampaign;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.DummyUserInfo;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SendEmailCampaignController {

    @FXML
    private Label statusLabel;
    @FXML
    private ListView<String> recipientsListView;
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextArea bodyTextArea;

    @FXML
    public void initialize() {
        ArrayList<String> emails = DummyUserInfo.getAllEmails();
        recipientsListView.getItems().addAll(emails);
    }

    @FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
        String subject = subjectTextField.getText();
        String body = bodyTextArea.getText();
        ObservableList<String> observableRecipients = recipientsListView.getItems();
        ArrayList<String> recipients = new ArrayList<>(observableRecipients);

        if (recipients.isEmpty() || subject.isEmpty() || body.isEmpty()) {
            statusLabel.setText("All fields must be filled.");
            return;
        }

        MarketingExecutive executive = new MarketingExecutive();
        EmailCampaign campaign = executive.sendEmailCampaign(subject, body, recipients);

        if (campaign.isSent()) {
            String recipientText = "";
            for (int i = 0; i < recipients.size(); i++) {
                recipientText = recipientText + recipients.get(i);
                if (i != recipients.size() - 1) {
                    recipientText = recipientText + ", ";
                }
            }
            statusLabel.setText("Email sent to: " + recipientText);
        } else {
            statusLabel.setText("Failed to send email.");
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
