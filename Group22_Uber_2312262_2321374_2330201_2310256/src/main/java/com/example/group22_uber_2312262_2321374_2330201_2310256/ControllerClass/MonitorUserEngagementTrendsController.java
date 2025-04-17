package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.UserEngagementTrend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class MonitorUserEngagementTrendsController {

    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TableColumn<UserEngagementTrend, LocalDate> dateCol;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private TableView<UserEngagementTrend> tableView;
    @FXML
    private Label statusLabel;
    @FXML
    private TableColumn nameCol;
    @FXML
    private TableColumn durationCol;

    @FXML
    public void initialize() {

        nameCol.setCellValueFactory(new PropertyValueFactory<>("passengerName"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("rideDate"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("rideDurationInMinutes"));


    }

    @FXML
    public void showOnTableViewAndSaveReportButtonOnAction(ActionEvent actionEvent) {
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();

        if (start == null || end == null) {
            statusLabel.setText("Please select both start and end dates.");
            return;
        }

        MarketingExecutive executive = new MarketingExecutive();
        ArrayList<UserEngagementTrend> filteredList = executive.MonitorUserEngagementTrends(start, end);

        if (!filteredList.isEmpty()) {
            tableView.getItems().clear();
            tableView.getItems().addAll(filteredList);
            statusLabel.setText("Data loaded for selected date range.");

            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try{
                f = new File("rideReport.bin");
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(filteredList);
                oos.close();
                fos.close();
            }catch(Exception e){
                e.getMessage();
            }finally{
                try{
                    oos.close();
                    fos.close();
                }catch(Exception e){
                    e.getMessage();
                }

            }

        } else {
            tableView.getItems().clear();
            statusLabel.setText("No data found in the selected date range.");
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
