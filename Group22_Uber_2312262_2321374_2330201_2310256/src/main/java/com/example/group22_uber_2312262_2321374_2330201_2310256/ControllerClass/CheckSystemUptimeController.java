package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileWriter;

public class CheckSystemUptimeController {
    @FXML
    private Label systemUptimeStatusLabel;

    @FXML
    private Label outputLabel;

    private UptimeReport uptimeReport;

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
            alert.setContentText("Failed to load page " + "Error: " + e.getMessage());
            alert.showAndWait();
        }

    }

    public static class UptimeReport {
        private String percentage;
        private String message;

        public UptimeReport(String percentage, String message) {
            this.percentage = percentage;
            this.message = message;
        }

        public boolean saveReportToFile(File file) {
            try {
                FileWriter writer = new FileWriter(file);
                writer.write("Uptime: " + percentage + "\nStatus: " + message);
                writer.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    @FXML
    public void initialize() {
        String uptimePercentage = "99.9%";
        String uptimeMessage = "No major outage detected.";
        uptimeReport = new UptimeReport(uptimePercentage, uptimeMessage);
        systemUptimeStatusLabel.setText("Uptime: " + uptimePercentage + "  Status: " + uptimeMessage);
    }

    @FXML
    public void saveUptimeReportOnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Uptime Report");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        Stage stage = (Stage) systemUptimeStatusLabel.getScene().getWindow();
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            boolean success = uptimeReport.saveReportToFile(file);
            if (success) {
                outputLabel.setText("Report saved successfully.");
            } else {
                outputLabel.setText("Failed to save report.");
            }
        } else {
            outputLabel.setText("Save canceled.");
        }
    }
}
