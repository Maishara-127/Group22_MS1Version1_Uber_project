package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.CampaignPerformance;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrackRatingSummaryAndFeedBack {
    @FXML
    private TableColumn<CampaignPerformance, Integer> likesTableCol;
    @FXML
    private TableColumn<CampaignPerformance, Integer> commentsTableCol;
    @FXML
    private TableColumn<CampaignPerformance, LocalDate> dateRangeTableCol;

    @FXML
    private TableView<CampaignPerformance> performanceTableView;
    @FXML
    private ComboBox<String> selectCampaignCombobox;

    @FXML
    private Label statusLabel;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private TextField likesTextField;
    @FXML
    private TextField commentsTextField;

    @FXML
    public void initialize() {
        selectCampaignCombobox.getItems().addAll("Campaign1", "Campaign2", "Campaign3");
        likesTableCol.setCellValueFactory(new PropertyValueFactory<>("likes"));
        commentsTableCol.setCellValueFactory(new PropertyValueFactory<>("comments"));
        dateRangeTableCol.setCellValueFactory(new PropertyValueFactory<>("dateRange"));
    }

    @FXML
    public void filterDataButtonOnAction(ActionEvent actionEvent) {
        try {
            String selectedCampaign = selectCampaignCombobox.getValue();
            String likes = likesTextField.getText();
            String comments = commentsTextField.getText();
            LocalDate fromDate = fromDatePicker.getValue();
            LocalDate toDate = toDatePicker.getValue();

            if (selectedCampaign == null || selectedCampaign.isEmpty() || likes.isEmpty() || comments.isEmpty() || fromDate == null || toDate == null || fromDate.isAfter(toDate)) {
                statusLabel.setText("Please fill all fields correctly.");
                return;
            }

            int likesInt = Integer.parseInt(likes);
            int commentsInt = Integer.parseInt(comments);

            MarketingExecutive marketingExecutive = new MarketingExecutive();
            ArrayList<CampaignPerformance> filteredData = marketingExecutive.trackCampaignPerformance();

            performanceTableView.setItems(FXCollections.observableArrayList(filteredData));
            statusLabel.setText("Data filtered!");

        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }    @FXML
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
