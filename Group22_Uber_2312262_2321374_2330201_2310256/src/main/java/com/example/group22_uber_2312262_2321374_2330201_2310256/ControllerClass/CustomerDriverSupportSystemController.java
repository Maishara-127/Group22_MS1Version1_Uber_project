package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SupportTicket;
import javafx.stage.Stage;

public class CustomerDriverSupportSystemController
{
    @FXML
    private ComboBox<String> issueTypeCombobox;
    @FXML private TextArea issueDescriptionTextArea;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {
        issueTypeCombobox.getItems().addAll("Driver Issues", "Payment Issues", "App Bugs");
    }

    @FXML
    private void createTicketButtonOnAction(ActionEvent actionEvent) {
        String issueType = issueTypeCombobox.getValue();
        String description = issueDescriptionTextArea.getText();

        if (issueType != null && !description.isEmpty()) {
            SupportTicket ticket = new SupportTicket(issueType, description);
            statusLabel.setText("Ticket Created: " + ticket.getIssueType());
        } else {
            statusLabel.setText("Please fill in all fields.");
        }
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
            alert.setContentText("Failed to load page " + " Error: " + e.getMessage());
            alert.showAndWait();
        }

    }
}