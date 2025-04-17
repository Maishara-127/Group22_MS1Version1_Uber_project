package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.DummyUptimeData;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.UptimeReport;

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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CheckSystemUptimeController {
    @FXML
    private Label systemUptimeStatusLabel;

    @FXML
    private Label outputLabel;


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

    @FXML
    public void initialize() {

    }

    @FXML
    private UptimeReport uptimeReport;

    public void saveUptimeReportOnAction(ActionEvent actionEvent) {
        uptimeReport = DummyUptimeData.getDummyUptimeReport();

        if (uptimeReport != null) {
            systemUptimeStatusLabel.setText("Uptime: " + uptimeReport.getUptimePercentage());
            outputLabel.setText("Status: " + uptimeReport.getUptimeMessage());
        } else {
            systemUptimeStatusLabel.setText("Uptime data not available.");
            outputLabel.setText("");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Uptime Report");
        File reportFile = fileChooser.showSaveDialog(null);

        if (reportFile != null) {
            SystemAdministrator systemAdministrator = new SystemAdministrator("Arpy", 111, "System Administrator", "Arpy@uber.com");

            boolean success = systemAdministrator.checkSystemUptime(uptimeReport, reportFile);

            if (success) {
                outputLabel.setText("Report saved successfully.");
            } else {
                outputLabel.setText("Failed to save report.");
            }
        } else {
            outputLabel.setText("No file selected.");
        }

        File f = null;
        FileOutputStream fis = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("uptimeReport.bin");
            fis = new FileOutputStream(f);
            oos = new ObjectOutputStream(fis);
            oos.writeObject(reportFile);
            oos.close();
            fis.close();
            outputLabel.setText("Report saved!");
        } catch (Exception e) {
            outputLabel.setText("Error:" + e.getMessage());
        }finally{
            try {
                if (oos != null) oos.close();
                if (fis != null) fis.close();
            } catch (Exception e) {
                outputLabel.setText("Error: " + e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    }
}