package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class ScheduleAutomatedSocialMediaPostController {

    @FXML
    private TextArea postContentTextArea;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField timeTextField;
    @FXML
    private Label statusLabel;

    @FXML
    public void schedulePostButtonOnAction(ActionEvent actionEvent) {
        String date = datePicker.getValue().toString();
        String time = timeTextField.getText();

        if (postContentTextArea.getText().isEmpty() || time.isEmpty()) {
            statusLabel.setText("Please fill in all fields!");
            return;
        }

        try {
            String dateTimeStr = date + "T" + time;
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);
            String content = postContentTextArea.getText();

            MarketingExecutive marketingExecutive = new MarketingExecutive();
            boolean isPostScheduled = marketingExecutive.scheduleAutomatedSocialMediaPost("Facebook", content, dateTime);

            if (isPostScheduled) {
                statusLabel.setText("Post scheduled successfully!");
            } else {
                statusLabel.setText("Invalid Date or Time! Please enter a future date.");
            }
        } catch (Exception e) {
            statusLabel.setText("Invalid time format!");
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
