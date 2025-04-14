package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.EngagementData;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class MonitorUserEngagementTrendsController {

    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TableColumn<EngagementData, String> metricNameCol;
    @FXML
    private TableColumn<EngagementData, LocalDate> dateCol;
    @FXML
    private ComboBox<String> metricCombobox;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private TableView<EngagementData> tableView;
    @FXML
    private TableColumn<EngagementData, String> valueCol;
    @FXML
    private Label statusLabel;
    @FXML
    private TextField valueTextField;

    @FXML
    public void initialize() {

        metricCombobox.getItems().addAll("Session Duration", "Click-Through Rate", "Interactions", "Sessions");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        metricNameCol.setCellValueFactory(new PropertyValueFactory<>("metricName"));
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
    }

    @FXML
    public void showOnTableViewAndSaveReportButtonOnAction(ActionEvent actionEvent) {
        String selectedMetric = metricCombobox.getValue();
        String value = valueTextField.getText();

        if (selectedMetric == null || value == null || value.isEmpty()) {
            statusLabel.setText("Please select a metric and input a value.");
            return;
        }

        MarketingExecutive marketingExecutive = new MarketingExecutive();
        ArrayList<EngagementData> engagementDataList = marketingExecutive.monitorUserEngagement(selectedMetric, value);

        if (!engagementDataList.isEmpty()) {
            tableView.getItems().setAll(engagementDataList);
            statusLabel.setText("Engagement data loaded.");
        } else {
            statusLabel.setText("No data found.");
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
