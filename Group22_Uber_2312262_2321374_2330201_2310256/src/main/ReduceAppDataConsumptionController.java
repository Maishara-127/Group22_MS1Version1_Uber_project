package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.DataSetting;
import javafx.stage.Stage;

public class ReduceAppDataConsumptionController {
    @javafx.fxml.FXML
    private CheckBox lowDataModeCheckBox;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private DataSetting dataSetting;

    @javafx.fxml.FXML
    public void initialize() {
        dataSetting = new DataSetting(false);
    }

    @javafx.fxml.FXML
    public void saveSettingButtonOnAction(ActionEvent actionEvent) {
        boolean selected = lowDataModeCheckBox.isSelected();
        SystemAdministrator systemAdmin = new SystemAdministrator("Admin", 1, "System Admin", "admin@uber.com");
        systemAdmin.reduceAppDataConsumption(selected);
    }
    @javafx.fxml.FXML
    public void checkDataUsageButtonOnAction(ActionEvent actionEvent) {
        String report = dataSetting.getDataUsageReport();
        statusLabel.setText(report);
    }

    @javafx.fxml.FXML
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
